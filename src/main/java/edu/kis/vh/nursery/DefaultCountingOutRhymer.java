package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int NEGATIVE_ONE = -1;
    public static final int FULL = 11;

    private final int[] numbers = new int[12];

    public int TOTAL = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++TOTAL] = in;
    }

    public boolean callCheck() {
        return TOTAL == NEGATIVE_ONE;
    }

    public boolean isFull() {
        return TOTAL == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return NEGATIVE_ONE;
        return numbers[TOTAL];
    }

    public int countOut() {
        if (callCheck())
            return NEGATIVE_ONE;
        return numbers[TOTAL--];
    }

}
