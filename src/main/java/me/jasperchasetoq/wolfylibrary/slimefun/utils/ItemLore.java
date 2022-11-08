package me.jasperchasetoq.wolfylibrary.slimefun.utils;

import me.jasperchasetoq.wolfylibrary.slimefun.items.api.MachineLevel;
import me.jasperchasetoq.wolfylibrary.slimefun.items.api.MachineType;

import javax.annotation.Nonnull;

public class ItemLore {
    private ItemLore() {}

    public static @Nonnull String EnergyPerSlimefunTick(int energy) {
        return energy(energy, "/T");
    }
    public static @Nonnull String energy(int power, @Nonnull String suffix) {
        return "&6⚡ &7" + power + " J" + suffix;
    }
    public static @Nonnull String EnergyStorage(int energy) {
        return energy(energy, " Storage");
    }
    public static @Nonnull String machine(@Nonnull MachineLevel level, @Nonnull MachineType type) {
        return level + "" + type;
    }
    public static @Nonnull String speedEnhancements(int speedEnhancements) {
        return ("&6⚡ &7"+ speedEnhancements+ "&7x");
    }

}
