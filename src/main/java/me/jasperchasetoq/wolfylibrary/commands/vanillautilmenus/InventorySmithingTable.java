package me.jasperchasetoq.wolfylibrary.commands.vanillautilmenus;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class InventorySmithingTable implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Inventory menutype = Bukkit.createInventory(player, InventoryType.SMITHING);
            player.openInventory(menutype);

        }
        return true;

    }
}

