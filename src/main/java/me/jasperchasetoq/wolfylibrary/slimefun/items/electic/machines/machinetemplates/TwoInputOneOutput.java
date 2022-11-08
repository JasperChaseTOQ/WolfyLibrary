package me.jasperchasetoq.wolfylibrary.slimefun.items.electic.machines.machinetemplates;

public class TwoInputOneOutput {

    //Inventory Menu Slots
    private static final int[] FIRST_INPUT_BORDER = {1, 2, 3, 10, 12, 19, 20, 21};
    private static final int[] SECOND_INPUT_BORDER = {5, 6, 7, 14, 16, 23, 24, 25};
    private static final int[] FIRST_OUTPUT_BORDER = {30, 31, 32, 39, 41, 48, 49, 50};
    private static final int[] BACKGROUND = {0, 4, 8, 9, 13, 17, 18, 22, 26, 27, 28, 29, 33, 34, 35, 36, 37, 38, 42, 43, 44, 45, 46, 47, 51, 52, 53};

    //Item Input and Output slots
    public int[] getFirstInputSlot() {
        return new int[] {11};
    }
    public int[] getSecondInputSlot() {
        return new int[] {15};
    }
    public int[] getFirstOutputSlot() {
        return new int[] {40};
    }
    public int[] getInputSlots() {
        return new int[] {0};
    }
    public int[] getOutputSlots() {
        return new int[] {0};
    }
}
