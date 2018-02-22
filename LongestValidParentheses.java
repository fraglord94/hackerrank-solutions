package hackerrank.algorithms;

import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(')
                stack.push(i);
            else {
                stack.pop();

                int x = stack.peek();
                res = Math.max(res, i - x);

                if (stack.isEmpty())
                    stack.push(i);
            }
        }
        return res;
    }
}
