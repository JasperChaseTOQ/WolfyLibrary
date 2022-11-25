package me.jasperchasetoq.wolfylibrary.slimefun.items.api.abstracts;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import me.jasperchasetoq.wolfylibrary.slimefun.items.electic.machines.MenuUtils;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class MenuInventoryBlock extends SlimefunItem {

    public static final ItemStack WOLFY_MACHINE_MENU_BACKGROUND = MenuUtils.getWolfyMachineMenuBackgroundBorder();
    public static final ItemStack WOLFY_MACHINE_MENU_INPUT_BORDER_ONE = MenuUtils.getWolfyMachineMenuInputOneBorder();
    public static final ItemStack WOLFY_MACHINE_MENU_INPUT_BORDER_TWO = MenuUtils.getWolfyMachineMenuInputTwoBorder();
    public static final ItemStack WOLFY_MACHINE_MENU_OUTPUT_BORDER_ONE = MenuUtils.getWolfyMachineMenuOutputOneBorder();
    public static final ItemStack WOLFY_MACHINE_MENU_OUTPUT_BORDER_TWO = MenuUtils.getWolfyMachineMenuOutputTwoBorder();

    //for future plans
    public static final ItemStack WOLFY_MACHINE_MENU_POWER_BUTTON = MenuUtils.getWolfyMachineMenuPowerButtonBorder();
    public static final ItemStack WOLFY_MACHINE_MENU_POWER_STATUS = MenuUtils.getWolfyMachineMenuPowerStatusBorder();
    public static final ItemStack WOLFY_MACHINE_MENU_TRANSPORT_PORT = MenuUtils.getWolfyMachineMenuTransportPortBorder();

    public MenuInventoryBlock(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        addItemHandler(onBreak());

    }

    public int[] getFirstInputSlot() {
        return new int[] {};
    }
    public int[] getSecondInputSlot() {
        return new int[] {};
    }
    public int[] getFirstOutputSlot() {
        return new int[] {};
    }
    public int[] getSecondOutputSlot() {
        return new int[] {};
    }

    public BlockBreakHandler onBreak() {
        return new BlockBreakHandler(false, false) {

            @Override
            public void onPlayerBreak(BlockBreakEvent blockbreak, ItemStack item, List<ItemStack> drops) {
                Block machineblock = blockbreak.getBlock();
                BlockMenu inv = BlockStorage.getInventory(machineblock);

                if (inv != null) {
                    inv.dropItems(machineblock.getLocation(), getFirstInputSlot());
                    inv.dropItems(machineblock.getLocation(), getSecondInputSlot());
                    inv.dropItems(machineblock.getLocation(), getFirstOutputSlot());
                    inv.dropItems(machineblock.getLocation(), getSecondOutputSlot());
                }
            }
        };
    }
}
