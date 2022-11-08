package me.jasperchasetoq.wolfylibrary.slimefun.items.api;

import javax.annotation.Nonnull;

public enum MachineLevel {

    //Normal

    BASIC("&fBasic"),
    INTERMEDIATE("&fIntermediate"),
    ADVANCED("&fAdvanced"),
    ENDGAME("&fEnd Game"),

    //Special

    ENERGIZED("&fEnergized"),
    SPECIALIZED("&fSpecialized");


    private final String templating;


    MachineLevel(@Nonnull String templating) {
        this.templating = templating;
    }

    @Override
    public String toString() {
        return templating;
    }
}
