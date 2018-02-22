package hackerrank.algorithms;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    int minEle = Integer.MAX_VALUE;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            minEle = x;
        }
        if (x < minEle) {
            stack.push(2 * x - minEle);
            minEle = x;
        } else
            stack.push(x);
    }

    public void pop() {
        Integer x = stack.pop();
        if (x < minEle) {
            minEle = 2 * minEle - x;
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minEle;
    }
}
