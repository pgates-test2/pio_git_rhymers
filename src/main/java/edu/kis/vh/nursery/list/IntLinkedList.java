package edu.kis.vh.nursery.list;

public class IntLinkedList {
    public static final int ERROR = -1;
    Node last;
    int index;

    public void push(int value) {
        if (last == null)
            last = new Node(value);
        else {
            last.next = new Node(value);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return ERROR;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return ERROR;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
