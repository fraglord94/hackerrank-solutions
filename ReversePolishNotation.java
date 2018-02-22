package hackerrank.algorithms;

import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+"))
                stack.push(stack.pop() + stack.pop());
            else if (s.equals("-"))
                stack.push(stack.pop() - stack.pop());
            else if (s.equals("*"))
                stack.push(stack.pop() * stack.pop());
            else if (s.equals("/"))
                stack.push(stack.pop() / stack.pop());
            else
                stack.push(Integer.parseInt(s));
        }
        return stack.pop();
    }
}
