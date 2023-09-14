package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int ERROR_VALUE = -1;
    private Node last;
    private int index;

    protected void push(int value) {
        if (last == null)
            last = new Node(value);
        else {
            last.setNext(new Node(value));
            last.getNext().setPrev(last);
            last = last.getNext();
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
        return last.getValue();
    }

    private int pop() {
        if (isEmpty())
            return ERROR_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
