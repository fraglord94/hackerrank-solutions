/*
 * 
 * 
 * 
 */
package hackerrank.algorithms;

/**
 *
 * @author aronee
 */
public class MyStack {

    private final int maxSize;
    private long[] stackArray;
    private int top;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    void push(int element) {
        if (top < maxSize) {
            this.stackArray[++top] = element;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    long pop() {
        if (top < 0) {
            System.out.println("stack underflow");
            return Integer.MIN_VALUE;
        } else {
            return stackArray[top--];
        }
    }

    long peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            return Integer.MIN_VALUE;
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        MyStack theStack = new MyStack(10);

    }
}
