package hackerrank.algorithms;

import java.util.Stack;

public class LargestHistogram {
    public int largestRectangleArea(int[] a) {
        int n = a.length;
        int i = 0;
        int max = -1;
        Stack<Integer> stack = new Stack<>();
        while (i < n) {
            if (stack.isEmpty() || a[stack.peek()] <= a[i]) {
                stack.push(i);
                i++;
            } else {
                int top = stack.peek();
                stack.pop();
                int area = 0;
                if (stack.isEmpty())
                    area = a[top] * i;
                else
                    area = a[top] * (i - stack.peek() - 1);
                max = Math.max(area, max);
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.peek();
            stack.pop();
            int area = 0;
            if (stack.isEmpty())
                area = a[top] * i;
            else
                area = a[top] * (i - stack.peek() - 1);
            max = Math.max(area, max);
        }
        return max;
    }
}
