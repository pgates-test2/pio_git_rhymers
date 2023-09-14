package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int ERROR_VALUE = -1;
    Node last;
    private int index;

    protected void push(int value) {
        if (last == null)
            last = new Node(value);
        else {
            last.next = new Node(value);
            last.next.prev = last;
            last = last.next;
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    private boolean isFull() {
        return false;
    }

    protected int top() {
        if (isEmpty())
            return ERROR_VALUE;
        return last.value;
    }

    private int pop() {
        if (isEmpty())
            return ERROR_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
