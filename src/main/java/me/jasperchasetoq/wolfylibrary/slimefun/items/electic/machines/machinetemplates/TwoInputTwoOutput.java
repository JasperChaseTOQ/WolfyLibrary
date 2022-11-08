package me.jasperchasetoq.wolfylibrary.slimefun.items.electic.machines.machinetemplates;

public class TwoInputTwoOutput {

    //Inventory Menu Slots
    private static final int[] FIRST_INPUT_BORDER = {1, 2, 3, 10, 13, 19, 20, 21};
    private static final int[] SECOND_INPUT_BORDER = {28, 29, 30, 37, 39, 46, 47, 48};
    private static final int[] FIRST_OUTPUT_BORDER = {14, 15, 16, 23, 25};
    private static final int[] SECOND_OUTPUT_BORDER = {32, 34, 41, 42, 43};
    private static final int[] BACKGROUND = {0, 4, 5, 6, 7, 8, 9, 13, 17, 18, 22, 26, 27, 31, 35, 36, 40, 44, 45, 49, 50, 51, 52, 53};

    //Item Input and Output slots(
    public int[] getFirstInputSlot() {
        return new int[] {11};
    }
    public int[] getSecondInputSlot() {
        return new int[] {38};
    }
    public int[] getFirstOutputSlot() {
        return new int[] {24};
    }
    public int[] getSecondOutputSlot() {
        return new int[] {33};
    }
    public int[] getInputSlots() {
        return new int[] {11, 38};
    }
    public int[] getOutputSlots() {
        return new int[] {24, 33};
    }

}

