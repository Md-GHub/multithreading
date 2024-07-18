package Synchronization;

public class customStack {
    private int[] stack;
    private int capacity;
    private int stackTop;

    public customStack(int capacity) {
        this.stack = new int[capacity];
        this.capacity = capacity;
        stackTop = -1;
    }

    public boolean isFull() {
        return stackTop >= stack.length - 1;
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public synchronized void push(int val) {
        if (this.isFull()) return;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        stack[++stackTop] = val;
    }

    public synchronized int pop() {
        if (this.isEmpty()) return Integer.MIN_VALUE;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        return stack[stackTop--];
    }
}
