package me.jasperchasetoq.wolfylibrary.slimefun.abstracts.generators;

import io.github.thebusybiscuit.slimefun4.implementation.items.electric.AbstractEnergyProvider;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class AbstractInWorldEnergyGenerator {

    private int energyProduction = -1;

    public ItemStack getProgressBar() {
        return new ItemStack(Material.CLOCK);
    }
    public int getEnergyProduction() {
        return energyProduction;
    }
}
