package me.jasperchasetoq.wolfylibrary.slimefun.utils;

import javax.annotation.Nonnull;

public class ItemLore {
    private ItemLore() {}

    public static @Nonnull String EnergyPerSlimefunTick(int energy) {
        return energy(energy, "/t");
    }
    public static @Nonnull String energy(int power, @Nonnull String suffix) {
        return "&6⚡ &7" + power + " J" + suffix;
    }
    public static @Nonnull String EnergyStorage(int energy) {
        return energy(energy, " Storage");
    }
}
