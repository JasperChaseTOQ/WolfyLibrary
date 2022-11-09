package me.jasperchasetoq.wolfylibrary.slimefun.items.electic.machines.machinetemplates;

//one constant input and one variable input
public class TwoInputOneOutputVersionTwo {

    //Inventory Menu Slots
    private static final int[] FIRST_INPUT_BORDER = {0, 1, 2, 9, 11, 18, 19, 20};
    private static final int[] SECOND_INPUT_BORDER = {7, 16, 17};
    private static final int[] FIRST_OUTPUT_BORDER = {27, 28, 29, 36, 38, 45, 46, 47};
    private static final int[] BACKGROUND = {3, 4, 5, 6, 12, 13, 14, 15, 20, 21, 22, 23, 24, 25, 26, 30, 31, 32, 33, 34, 35, 39, 40, 41, 42, 43, 44, 47, 48, 49, 50, 51, 52, 53};

    //Item Input and Output slots(
    public int[] getFirstInputSlot() {
        return new int[] {10};
    }
    public int[] getSecondInputSlot() {
        return new int[] {8};
    }
    public int[] getFirstOutputSlot() {
        return new int[] {37};
    }
    public int[] getInputSlots() {
        return new int[] {8, 10};
    }
    public int[] getOutputSlots() {
        return new int[] {37};
    }
}
