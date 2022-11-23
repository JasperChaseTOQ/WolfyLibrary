package me.jasperchasetoq.wolfylibrary.slimefun.items.electic.machines.machinetemplates;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

public class OneInputOneOutput extends AContainer {

    //Inventory Menu Slots
    private static final int[] FIRST_INPUT_BORDER = {0};
    private static final int[] FIRST_OUTPUT_BORDER = {30, 31, 32, 39, 41, 48, 49, 50};
    private static final int[] BACKGROUND = {0};

    @ParametersAreNonnullByDefault
    public OneInputOneOutput(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    //Type of machine
    public String getMachineIdentifier() {
        return "ONEINPUTONEOUTPUT";
    }
    //Recipe Progress
    public ItemStack getProgressBar() {
        return new ItemStack(Material.CLOCK);
    }
    //Item Input and Output slots
    public int[] getFirstInputSlot() {
        return new int[] {0};
    }

    public int[] getFirstOutputSlot() {
        return new int[] {0};
    }
    public int[] getInputSlots() {
        return new int[] {0};
    }
    public int[] getOutputSlots() {
        return new int[] {0};
    }
}
