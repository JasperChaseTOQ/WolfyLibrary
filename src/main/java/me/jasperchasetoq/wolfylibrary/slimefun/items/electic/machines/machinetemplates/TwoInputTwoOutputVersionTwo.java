package me.jasperchasetoq.wolfylibrary.slimefun.items.electic.machines.machinetemplates;


//one main output and one byproduct output
public class TwoInputTwoOutputVersionTwo {

    //Inventory Menu Slots
    private static final int[] FIRST_INPUT_BORDER = {0, 1, 2, 9, 11, 18, 19, 20};
    private static final int[] SECOND_INPUT_BORDER = {6, 7, 8, 15, 17, 24, 25, 26};
    private static final int[] FIRST_OUTPUT_BORDER = {30, 31, 32, 39, 41, 48, 49, 50};
    private static final int[] SECOND_OUTPUT_BORDER = {43, 44, 52};
    private static final int[] BACKGROUND = {3, 4, 5, 12, 13, 14, 21, 22, 23, 27, 28, 29, 33, 34, 35, 36, 37, 38, 42, 45, 46, 47, 51};

    //Item Input and Output slots(
    public int[] getFirstInputSlot() {
        return new int[] {10};
    }
    public int[] getSecondInputSlot() {
        return new int[] {16};
    }
    public int[] getFirstOutputSlot() {
        return new int[] {40};
    }
    public int[] getSecondOutputSlot() {
        return new int[] {53};
    }
    public int[] getInputSlots() {
        return new int[] {10, 16};
    }
    public int[] getOutputSlots() {
        return new int[] {40, 53};
    }
}
