package hackerrank.algorithms;

import java.util.Stack;

public class VerifyPreOrder {
    public boolean verifyPreorder(int[] a) {
        int low = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int x : a) {
            if (x < low)
                return false;
            if (stack.size() != 0 && stack.peek() < low)
                low = stack.pop();
            stack.push(x);
        }
        return true;
    }
}
