package me.jasperchasetoq.wolfylibrary.slimefun.abstracts.generators;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemState;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineProcessHolder;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.core.machines.MachineProcessor;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.AbstractEnergyProvider;
import io.github.thebusybiscuit.slimefun4.implementation.operations.FuelOperation;
import io.github.thebusybiscuit.slimefun4.libraries.commons.lang.Validate;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.jasperchasetoq.wolfylibrary.slimefun.items.electic.machines.MenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractEnergyFuelGenerator extends AbstractEnergyProvider implements MachineProcessHolder<FuelOperation> {
    private static final int[] BACKGROUND = {12, 13, 14, 21, 23, 30, 31 ,32};
    private static final int[] FUEL_BORDER = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 15, 16, 17, 18, 19, 20, 24, 25, 26, 27, 28, 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44};
    private final MachineProcessor<FuelOperation> processingFuel = new MachineProcessor<>(this);
    private int EnergyGenerated = -1;
    private int EnergyStorage = -1;

    @ParametersAreNonnullByDefault
    protected AbstractEnergyFuelGenerator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        addItemHandler(onBreak());
        processingFuel.setProgressBar(getProgressBar());
        registerDefaultFuelTypes();
        new BlockMenuPreset(item.getItemId(), getInventoryTitle()) {
            @Override
            public void init() {
                constructMenu(this);
            }

            @Override
            public boolean canOpen(Block b, Player p) {
                return p.hasPermission("slimefun.inventory.bypass") || Slimefun.getProtectionManager().hasPermission(p, b.getLocation(), Interaction.INTERACT_BLOCK);
            }

            @Override
            public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
                if (flow == ItemTransportFlow.INSERT) {
                    return getFuelSlot();
                } else {
                    return null;
                }
            }
        };
    }
    @Override
    public MachineProcessor<FuelOperation> getMachineProcessor() {
        return processingFuel;
    }
    public int[] getFuelSlot() {
        return new int[] {22};
    }
    public int getEnergyStorage() {
        return EnergyStorage;
    }
    @Override
    public int getEnergyProduction() {
        return EnergyGenerated;
    }
    public final AbstractEnergyFuelGenerator setEnergyStorage(int storage) {
        Validate.isTrue(storage >= 0, "The storage must be positive");

        if (getState() == ItemState.UNREGISTERED) {
            this.EnergyStorage = storage;
            return this;

        } else {
            throw new IllegalStateException("You cannot edit the storage after the generator was setup.");
        }
    }

    @Override
    public int getGeneratedOutput(Location location, Config config) {
        BlockMenu menu = BlockStorage.getInventory(location);
        FuelOperation fuelConsumption = processingFuel.getOperation(location);
        if (fuelConsumption != null) {
            if (!fuelConsumption.isFinished()) {
                processingFuel.updateProgressBar(menu, 4, fuelConsumption);
                if (isChargeable()) {
                    int storedEnergy = getCharge(location, config);
                    if (getEnergyStorage() - storedEnergy >= getEnergyProduction()) {
                        fuelConsumption.addProgress(1);
                        return getEnergyProduction();
                    }
                    return 0;
                } else {
                    fuelConsumption.addProgress(1);
                    return getEnergyProduction();
                }
            } else {
                processingFuel.endOperation(location);
                return 0;
            }
        } else {
            Map<Integer, Integer> found = new HashMap<>();
            MachineFuel GeneratorFuel = findRecipe(menu, found);
            if (GeneratorFuel != null) {
                for (Map.Entry<Integer, Integer> entry : found.entrySet()) {
                    menu.consumeItem(entry.getKey(), entry.getValue());
                }
                processingFuel.startOperation(location, new FuelOperation(GeneratorFuel));
            }
            return 0;
        }
    }
    private MachineFuel findRecipe(BlockMenu menu, Map<Integer, Integer> found) {
        for (MachineFuel GeneratorFuel : fuelTypes) {
            for (int slot : getInputSlots()) {
                if (GeneratorFuel.test(menu.getItemInSlot(slot))) {
                    found.put(slot, GeneratorFuel.getInput().getAmount());
                    return GeneratorFuel;
                }
            }
        }
        return null;
    }
    protected void constructMenu(@Nonnull BlockMenuPreset preset) {
        for (int i : BACKGROUND) {
            preset.addItem(i, MenuUtils.getWolfyFuelGeneratorMenuBackground(), ChestMenuUtils.getEmptyClickHandler());
        }
        for (int i : FUEL_BORDER) {
            preset.addItem(i, MenuUtils.getWolfyFuelGeneratorMenuFuelBorder(), ChestMenuUtils.getEmptyClickHandler());
        }
    }
    public BlockBreakHandler onBreak() {
        return new BlockBreakHandler(false, false) {
            @Override
            public void onPlayerBreak(BlockBreakEvent blockBreak, ItemStack item, List<ItemStack> drops) {
                Block fuelGenerator = blockBreak.getBlock();
                BlockMenu menu = BlockStorage.getInventory(fuelGenerator);
                if (menu != null) {
                    menu.dropItems(fuelGenerator.getLocation(), getFuelSlot());
                }
                processingFuel.endOperation(fuelGenerator);
            }
        };
    }
    @Override
    public void register(@Nonnull SlimefunAddon addon) {
        this.addon = addon;
        if (getEnergyStorage() < 0) {
            warn("Energy storage has not been setup properly. The setup was canceled");
            warn("Make sure to correctly setup  '" + getClass().getSimpleName() + "#setEnergyStorage(...)'");
        }
        if (getEnergyProduction() <= 0) {
            warn("The energy production has not been setup properly. The setup was canceled");
            warn("Make sure to correctly setup '" + getClass().getSimpleName() + "#setEnergyProduction(...)'");
        }
        if (getEnergyStorage() >= 0 && getEnergyProduction() > 0) {
            super.register(addon);
        }
    }
}


