package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int ERROR = -1;
    private static final int MAX_INDEX =11;
    private static final int MAX_SIZE= 12;
    private static final int STACK_EMPTY = -1;
    private int[] numbers = new int[MAX_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = -1;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == STACK_EMPTY;
    }

    protected boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
