package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static int num12 = 12;
    private static int numMinus1 = -1;
    private static int num11 = 11;
    private final int[] NUMBERS = new int[num12];

    public static int getNum12() {
        return num12;
    }

    public static int getNumMinus1() {
        return numMinus1;
    }

    public static int getNum11() {
        return num11;
    }


    public int getTotal() {
        return total;
    }

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

    public int[] getNUMBERS() {
        return NUMBERS;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
