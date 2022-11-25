package me.jasperchasetoq.wolfylibrary.slimefun.abstracts.generators;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.jasperchasetoq.wolfylibrary.slimefun.items.electic.machines.MenuUtils;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public abstract class AbstractInventoryMenu extends SlimefunItem {

    //Inventory Menu
    public static final ItemStack BACKGROUND = new CustomItemStack(MenuUtils.getWolfyInventoryMenuBackground());
    public static final ItemStack INPUT_BORDER = new CustomItemStack(MenuUtils.getWolfyInventoryMenuInput());
    public static final ItemStack OUTPUT_BORDER = new CustomItemStack(MenuUtils.getWolfyInventoryMenuOutput());

    public AbstractInventoryMenu(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        addItemHandler(onBreak());
    }

    protected abstract int[] getInputSlots();

    protected abstract int[] getOutputSlots();
    public BlockBreakHandler onBreak() {
        return new BlockBreakHandler(false, false) {

            @Override
            public void onPlayerBreak(BlockBreakEvent blockBreak, ItemStack item, List<ItemStack> drops) {
                Block machineBlock = blockBreak.getBlock();
                BlockMenu inv = BlockStorage.getInventory(machineBlock);

                if (inv != null) {
                    inv.dropItems(machineBlock.getLocation(), getInputSlots());
                    inv.dropItems(machineBlock.getLocation(), getOutputSlots());
                }
            }
        };
    }
}

