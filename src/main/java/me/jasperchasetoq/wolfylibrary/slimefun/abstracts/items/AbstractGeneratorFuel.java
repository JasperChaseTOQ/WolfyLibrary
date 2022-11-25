package me.jasperchasetoq.wolfylibrary.slimefun.abstracts.items;

import io.github.thebusybiscuit.slimefun4.libraries.commons.lang.Validate;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ItemStackWrapper;
import org.bukkit.inventory.ItemStack;

import java.util.function.Predicate;

public abstract class AbstractGeneratorFuel implements Predicate<ItemStack> {

    private final int FuelProcess;
    private final ItemStack GeneratorFuel;
    private final ItemStackWrapper wrapper;
    private final ItemStack remnants;

    public AbstractGeneratorFuel(int FuelLength, ItemStack GeneratorFuel) {
        this(FuelLength, GeneratorFuel, null);
    }
    public ItemStack getGeneratorFuel() {
        return GeneratorFuel;
    }
    public ItemStack getRemnants() {
        return remnants;
    }
    public int getFuelProcess() {
        return FuelProcess;
    }
    /**
     * @param FuelLength
     * the amount of time the fuel takes to be consumed
     * @param GeneratorFuel
     * the fuel that the generator uses
     * @param remnants
     * what's left over if anything after the fuel is consumed (Ex: bucket from lava bucket, cinders from wood)
     */
    public AbstractGeneratorFuel(int FuelLength, ItemStack GeneratorFuel, ItemStack remnants) {
        Validate.notNull(GeneratorFuel, "there must be fuel to operate");
        Validate.isTrue(FuelLength > 0, "Fuel must be consumed");
        this.FuelProcess = FuelLength;
        this.GeneratorFuel = GeneratorFuel;
        this.wrapper = ItemStackWrapper.wrap(GeneratorFuel);
        this.remnants = remnants;
    }
    @Override
    public boolean test(ItemStack item) {
        return SlimefunUtils.isItemSimilar(item, wrapper, true);
    }
}
