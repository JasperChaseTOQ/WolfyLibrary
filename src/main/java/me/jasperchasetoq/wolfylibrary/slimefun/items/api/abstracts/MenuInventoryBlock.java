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

    public static final ItemStack WOLFY_MACHINE_MENU_BACKGROUND = MenuUtils.getWolfyMachineMenuBackgroundTile();
    public static final ItemStack WOLFY_MACHINE_MENU_INPUT_BORDER_ONE = MenuUtils.getWolfyMachineMenuInputOneTile();
    public static final ItemStack WOLFY_MACHINE_MENU_INPUT_BORDER_TWO = MenuUtils.getWolfyMachineMenuInputTwoTile();
    public static final ItemStack WOLFY_MACHINE_MENU_OUTPUT_BORDER_ONE = MenuUtils.getWolfyMachineMenuOutputOneTile();
    public static final ItemStack WOLFY_MACHINE_MENU_OUTPUT_BORDER_TWO = MenuUtils.getWolfyMachineMenuOutputTwoTile();

    //for future plans
    public static final ItemStack WOLFY_MACHINE_MENU_POWER_BUTTON = MenuUtils.getWolfyMachineMenuPowerButtonTile();
    public static final ItemStack WOLFY_MACHINE_MENU_POWER_STATUS = MenuUtils.getWolfyMachineMenuPowerStatusTile();
    public static final ItemStack WOLFY_MACHINE_MENU_TRANSPORT_PORT = MenuUtils.getWolfyMachineMenuTransportPortTile();

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
