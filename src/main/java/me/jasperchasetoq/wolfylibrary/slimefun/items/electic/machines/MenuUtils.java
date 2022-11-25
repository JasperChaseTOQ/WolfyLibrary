package me.jasperchasetoq.wolfylibrary.slimefun.items.electic.machines;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

@SuppressWarnings("deprecation")
public final class MenuUtils {

    private MenuUtils() {
    }

    //Machine Menu
    private static final ItemStack WOLFY_MACHINE_MENU_BACKGROUND = new SlimefunItemStack("JC_MACHINE_MENU_BACKGROUND", Material.GRAY_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_MACHINE_MENU_INPUT_BORDER_ONE = new SlimefunItemStack("JC_MACHINE_MENU_INPUT_BORDER_ONE", Material.CYAN_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_MACHINE_MENU_INPUT_BORDER_TWO = new SlimefunItemStack("JC_MACHINE_MENU_INPUT_BORDER_TWO", Material.CYAN_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_MACHINE_MENU_OUTPUT_BORDER_ONE = new SlimefunItemStack("JC_MACHINE_MENU_OUTPUT_BORDER_ONE", Material.ORANGE_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_MACHINE_MENU_OUTPUT_BORDER_TWO = new SlimefunItemStack("JC_MACHINE_MENU_OUTPUT_BORDER_TWO", Material.ORANGE_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_MACHINE_MENU_POWER_BUTTON = new SlimefunItemStack("JC_MACHINE_MENU_POWER_BUTTON", Material.RED_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_MACHINE_MENU_POWER_STATUS = new SlimefunItemStack("JC_MACHINE_MENU_POWER_STATUS", Material.OAK_SIGN, " ");
    private static final ItemStack WOLFY_MACHINE_MENU_TRANSPORT_PORT = new SlimefunItemStack("JC_MACHINE_MENU_TRANSPORT_PORT", Material.GREEN_STAINED_GLASS_PANE, " ");
    private static final ChestMenu.MenuClickHandler WOLFY_MACHINE_MENU_NO_CLICK = (p, s, i, a) -> false;

    //Inventory Menu
    private static final ItemStack WOLFY_INVENTORY_MENU_BACKGROUND = new SlimefunItemStack("JC_INVENTORY_MENU_BACKGROUND", Material.GRAY_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_INVENTORY_MENU_INPUT = new SlimefunItemStack("JC_INVENTORY_MENU_INPUT", Material.CYAN_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_INVENTORY_MENU_OUTPUT = new SlimefunItemStack("JC_INVENTORY_MENU_OUTPUT", Material.ORANGE_STAINED_GLASS_PANE, " ");


    //Fuel Generator Menu
    private static final ItemStack WOLFY_FUEL_GENERATOR_MENU_BACKGROUND = new SlimefunItemStack("JC_FUEL_GENERATOR_MENU_BACKGROUND", Material.GRAY_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_FUEL_GENERATOR_MENU_FUEL_BORDER = new SlimefunItemStack("JC_FUEL_GENERATOR_MENU_FUEL_BORDER", Material.YELLOW_STAINED_GLASS_PANE, " ");


    //Machine Menu Utils
    public static @Nonnull ItemStack getWolfyMachineMenuBackgroundBorder() {
        return WOLFY_MACHINE_MENU_BACKGROUND;
    }
    public static @Nonnull ItemStack getWolfyMachineMenuInputOneBorder() {
        return WOLFY_MACHINE_MENU_INPUT_BORDER_ONE;
    }
    public static @Nonnull ItemStack getWolfyMachineMenuInputTwoBorder() {
        return WOLFY_MACHINE_MENU_INPUT_BORDER_TWO;
    }
    public static @Nonnull ItemStack getWolfyMachineMenuOutputOneBorder() {
        return WOLFY_MACHINE_MENU_OUTPUT_BORDER_ONE;
    }
    public static @Nonnull ItemStack getWolfyMachineMenuOutputTwoBorder() {
        return WOLFY_MACHINE_MENU_OUTPUT_BORDER_TWO;
    }
    public static @Nonnull ChestMenu.MenuClickHandler getWolfyMachineMenuDecorationBorder() {
        return WOLFY_MACHINE_MENU_NO_CLICK;
    }
    public static @Nonnull ItemStack getWolfyMachineMenuPowerButtonBorder() {
        return WOLFY_MACHINE_MENU_POWER_BUTTON;
    }
    public static @Nonnull ItemStack getWolfyMachineMenuPowerStatusBorder() {
        return WOLFY_MACHINE_MENU_POWER_STATUS;
    }
    public static @Nonnull ItemStack getWolfyMachineMenuTransportPortBorder() {
        return WOLFY_MACHINE_MENU_TRANSPORT_PORT;
    }

    //Fuel Generator Menu Utils
    public static @Nonnull ItemStack getWolfyFuelGeneratorMenuBackground() {
        return WOLFY_FUEL_GENERATOR_MENU_BACKGROUND;
    }
    public static @Nonnull ItemStack getWolfyFuelGeneratorMenuFuelBorder() {
        return WOLFY_FUEL_GENERATOR_MENU_FUEL_BORDER;
    }

    //Inventory Menu Utils
    public static @Nonnull ItemStack getWolfyInventoryMenuBackground() {
        return WOLFY_INVENTORY_MENU_BACKGROUND;
    }
    public static @Nonnull ItemStack getWolfyInventoryMenuInput() {
        return WOLFY_INVENTORY_MENU_INPUT;
    }
    public static @Nonnull ItemStack getWolfyInventoryMenuOutput() {
        return WOLFY_INVENTORY_MENU_OUTPUT;
    }
}