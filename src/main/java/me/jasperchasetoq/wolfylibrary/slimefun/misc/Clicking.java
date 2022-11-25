package me.jasperchasetoq.wolfylibrary.slimefun.misc;

public class Clicking {
    //types of clicking
    private final boolean rightClicking;
    private final boolean rightShiftClicking;
    private final boolean leftClicking;
    private final boolean leftShiftClicking;

    //defines the type of clicking
    public Clicking(boolean rightClick, boolean rightShiftClick, boolean leftClick, boolean leftShiftClick) {
        rightClicking = rightClick;
        rightShiftClicking = rightShiftClick;
        leftClicking = leftClick;
        leftShiftClicking = leftShiftClick;
    }

    //gets the type of clicking
    public boolean isRightClick() {
        return rightClicking;
    }
    public boolean isRightShiftClick() {
        return rightShiftClicking;
    }
    public boolean isLeftClick() {
        return leftClicking;
    }
    public boolean isLeftShiftClick() {
        return leftShiftClicking;
    }
}