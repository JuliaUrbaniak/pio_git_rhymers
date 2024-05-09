package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int num12 = 12;
    private static final int numMinus1 = -1;
    private static final int num11 = 11;
    private final int[] NUMBERS = new int[num12];

    private int total = numMinus1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == numMinus1;
    }

    public boolean isFull() {
        return total == num11;
    }

    protected int peekaboo() {
        if (callCheck())
            return numMinus1;
        return NUMBERS[total];
    }


    public int countOut() {
        if (callCheck())
            return numMinus1;
        return NUMBERS[total--];
    }

}
