package me.jasperchasetoq.wolfylibrary.slimefun.items.electic.machines.machinetemplates;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.jasperchasetoq.wolfylibrary.slimefun.items.electic.machines.MenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("deprecation")
public class OneInputTwoOutput extends AContainer {

    //Inventory Menu Slots
    private static final int[] INPUT = {3, 4, 5, 12, 14, 21, 22, 23};
    private static final int[] OUTPUT = {37, 43};
    private static final int[] FIRST_INPUT = {3, 4, 5, 12, 14, 21, 22, 23};
    private static final int[] FIRST_INPUT_BORDER = {3, 4, 5, 12, 14, 21, 22, 23};
    private static final int[] FIRST_OUTPUT = {37};
    private static final int[] FIRST_OUTPUT_BORDER = {27, 28, 29, 36, 38, 45, 46, 47};
    private static final int[] SECOND_OUTPUT = {43};
    private static final int[] SECOND_OUTPUT_BORDER = {33, 34, 35, 42, 44, 51, 52, 53};
    private static final int[] BACKGROUND = {0, 1, 2, 6, 7, 8, 9, 10, 11, 15, 16, 17, 18, 19, 20, 24, 25, 26, 30, 31, 32, 39, 40, 41,48, 49, 50};

    @ParametersAreNonnullByDefault
    public OneInputTwoOutput(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }
    //Type of machine
    public String getMachineIdentifier() {
        return "ONEINPUTTWOOUTPUT";
    }
    //Recipe Progress
    public ItemStack getProgressBar() {
        return new ItemStack(Material.CLOCK);
    }
    //Item Input and Output slots(
    public int[] getFirstInputSlot() {
        return new int[] {13};
    }

    public int[] getFirstOutputSlot() {
        return new int[] {37};
    }
    public int[] getSecondOutputSlot() {
        return new int[] {43};
    }
    public int[] getInputSlots() {
        return new int[] {13};
    }
    public int[] getOutputSlots() {
        return new int[] {37, 43};
    }


    //Construct the inventory menu
    protected void constructMenu(@Nonnull BlockMenuPreset preset) {
        for (int i : BACKGROUND) {
            preset.addItem(i, MenuUtils.getWolfyMachineMenuBackgroundTile(), ChestMenuUtils.getEmptyClickHandler());
        }

        for (int i : FIRST_INPUT_BORDER) {
            preset.addItem(i, MenuUtils.getWolfyMachineMenuInputOneTile(), ChestMenuUtils.getEmptyClickHandler());
        }

        for (int i : FIRST_OUTPUT_BORDER) {
            preset.addItem(i, MenuUtils.getWolfyMachineMenuOutputOneTile(), ChestMenuUtils.getEmptyClickHandler());
        }

        for (int i : SECOND_OUTPUT_BORDER) {
            preset.addItem(i, MenuUtils.getWolfyMachineMenuInputTwoTile(), ChestMenuUtils.getEmptyClickHandler());
        }

        for (int i : getFirstOutputSlot()) {

            preset.addMenuClickHandler(i, new ChestMenu.AdvancedMenuClickHandler() {

                @Override
                public boolean onClick(Player p, int slot, ItemStack cursor, ClickAction action) {
                    return false;
                }

                @Override
                public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor, ClickAction action) {
                    return cursor == null || cursor.getType() == Material.AIR;
                }
            });

        }


    }
}

