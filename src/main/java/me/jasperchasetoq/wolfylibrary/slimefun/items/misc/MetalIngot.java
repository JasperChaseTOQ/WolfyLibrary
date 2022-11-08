package me.jasperchasetoq.wolfylibrary.slimefun.items.misc;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

public class MetalIngot extends SlimefunItem {

    @ParametersAreNonnullByDefault
    public MetalIngot(ItemGroup itemGroup, SlimefunItemStack item, ItemStack[] recipe) {
        super(itemGroup, item, RecipeType.SMELTERY, recipe);
    }

}
