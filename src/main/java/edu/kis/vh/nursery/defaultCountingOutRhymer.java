package edu.kis.vh.nursery;

/**
 * The defaultCountingOutRhymer class implements a basic counting
 */
public class defaultCountingOutRhymer {

    private static int num12 = 12;
    private static int numMinus1 = -1;
    private static int num11 = 11;
    private final int[] NUMBERS = new int[num12];

    /**
     * @return the fixed number 12 used for array size
     */
    public static int getNum12() {
        return num12;
    }

    /**
     * @return the fixed number -1 used as an error value
     */
    public static int getNumMinus1() {
        return numMinus1;
    }

    /**
     * @return the fixed number 11 used to check if stack is full
     */
    public static int getNum11() {
        return num11;
    }

    /**
     * @return the current total number of elements in the stack
     */
    public int getTotal() {
        return total;
    }

    private int total = numMinus1;

    /**
     * Adds an integer to the stack if it isn't full
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * @return true if the stack is empty otherwise false
     */
    public boolean callCheck() {
        return total == numMinus1;
    }

    /**
     * @return true if the stack is full otherwise false
     */
    public boolean isFull() {
        return total == num11;
    }

    /**
     * @return the value at the top without removing it, returns -1 if the stack is empty
     */
    protected int peekaboo() {
        if (callCheck())
            return numMinus1;
        return NUMBERS[total];
    }

    /**
     * Removes and returns the value at the top of the stack, returns -1 if the stack is empty
     * @return the value at the top of the stack or -1 if the stack is empty
     */
    public int countOut() {
        if (callCheck())
            return numMinus1;
        return NUMBERS[total--];
    }

    /**
     * @return the array representing the stack
     */
    public int[] getNUMBERS() {
        return NUMBERS;
    }

    /**
     * Sets the total number of elements in the stack
     */
    public void setTotal(int total) {
        this.total = total;
    }
}
