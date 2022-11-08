package me.jasperchasetoq.wolfylibrary.slimefun.items.api;

import javax.annotation.Nonnull;

public enum MachineType {

    //Normal

    MACHINE("&fMachine"),
    STORAGE("&fPower Storage"),
    GENERATOR("&fGenerator"),

    //Special

    ALCHEMIC("fAlchemic Machine");


    private final String templating;


    MachineType(@Nonnull String templating) {
        this.templating = templating;
    }

    @Override
    public String toString() {
        return templating;
    }
}
