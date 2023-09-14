package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int ERROR = -1;
    public static final int MAX_INDEX =11;
    public static final int MAX_SIZE= 12;
    public static final int STACK_EMPTY = -1;
    private int[] numbers = new int[MAX_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == STACK_EMPTY;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
