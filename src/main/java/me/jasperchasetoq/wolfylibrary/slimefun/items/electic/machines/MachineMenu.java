package me.jasperchasetoq.wolfylibrary.slimefun.items.electic.machines;

import me.jasperchasetoq.wolfylibrary.slimefun.misc.Clicking;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MachineMenu {

    @FunctionalInterface
    public interface MenuClicking {

        boolean Clicking(Player player, int menuSlot, ItemStack itemStack, Clicking clicking);
    }
    public interface UpgradedMenuClicking extends MenuClicking {

        boolean Clicking(InventoryClickEvent inventoryClickEvent, Player player, int menuSlot, ItemStack itemStack, Clicking clicking);
    }
}
