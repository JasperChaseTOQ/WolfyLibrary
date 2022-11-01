package me.wolfylibrary.slimefun.utils.items.machines;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

@SuppressWarnings("deprecation")
public final class MenuUtils {

    private MenuUtils() {
    }

    //currently plan to use

    private static final ItemStack WOLFY_MACHINE_MENU_BACKGROUND = new SlimefunItemStack("JC_MACHINE_MENU_BACKGROUND", Material.LIGHT_GRAY_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_MACHINE_MENU_INPUT_BORDER_ONE = new SlimefunItemStack("JC_MACHINE_MENU_INPUT_BORDER_ONE", Material.CYAN_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_MACHINE_MENU_INPUT_BORDER_TWO = new SlimefunItemStack("JC_MACHINE_MENU_INPUT_BORDER_TWO", Material.CYAN_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_MACHINE_MENU_OUTPUT_BORDER_ONE = new SlimefunItemStack("JC_MACHINE_MENU_OUTPUT_BORDER_ONE", Material.ORANGE_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_MACHINE_MENU_OUTPUT_BORDER_TWO = new SlimefunItemStack("JC_MACHINE_MENU_OUTPUT_BORDER_TWO", Material.ORANGE_STAINED_GLASS_PANE, " ");
    private static final ChestMenu.MenuClickHandler WOLFY_MACHINE_MENU_NO_CLICK = (p, s, i, a) -> false;


    //For future plans

    private static final ItemStack WOLFY_MACHINE_MENU_POWER_BUTTON = new SlimefunItemStack("JC_MACHINE_MENU_POWER_BUTTON", Material.RED_STAINED_GLASS_PANE, " ");
    private static final ItemStack WOLFY_MACHINE_MENU_POWER_STATUS = new SlimefunItemStack("JC_MACHINE_MENU_POWER_STATUS", Material.OAK_SIGN, " ");
    private static final ItemStack WOLFY_MACHINE_MENU_TRANSPORT_PORT = new SlimefunItemStack("JC_MACHINE_MENU_TRANSPORT_PORT", Material.GREEN_STAINED_GLASS_PANE, " ");

    public static @Nonnull ItemStack getWolfyMachineMenuBackgroundTile() {
        return WOLFY_MACHINE_MENU_BACKGROUND;
    }

    public static @Nonnull ItemStack getWolfyMachineMenuInputOneTile() {
        return WOLFY_MACHINE_MENU_INPUT_BORDER_ONE;
    }

    public static @Nonnull ItemStack getWolfyMachineMenuInputTwoTile() {
        return WOLFY_MACHINE_MENU_INPUT_BORDER_TWO;
    }

    public static @Nonnull ItemStack getWolfyMachineMenuOutputOneTile() {
        return WOLFY_MACHINE_MENU_OUTPUT_BORDER_ONE;
    }

    public static @Nonnull ItemStack getWolfyMachineMenuOutputTwoTile() {
        return WOLFY_MACHINE_MENU_OUTPUT_BORDER_TWO;
    }

    public static @Nonnull ChestMenu.MenuClickHandler getWolfyMachineMenuDecorationTile() {
        return WOLFY_MACHINE_MENU_NO_CLICK;
    }

    public static @Nonnull ItemStack getWolfyMachineMenuPowerButtonTile() {
        return WOLFY_MACHINE_MENU_POWER_BUTTON;
    }

    public static @Nonnull ItemStack getWolfyMachineMenuPowerStatusTile() {
        return WOLFY_MACHINE_MENU_POWER_STATUS;
    }

    public static @Nonnull ItemStack getWolfyMachineMenuTransportPortTile() {
        return WOLFY_MACHINE_MENU_TRANSPORT_PORT;
    }
}