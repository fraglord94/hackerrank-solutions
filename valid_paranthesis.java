package hackerrank.algorithms;

import java.util.Stack;

/**
 *
 * @author aronee
 */
public class valid_paranthesis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char upper = ' ';
            if (!stack.isEmpty()) {
                upper = stack.peek();
            }
            stack.push(s.charAt(i));
            char current = stack.peek();
            while (!stack.empty()) {
                if ((upper == '{' && current == '}') || (upper == '[' && current == ']') || (upper == '(' && current == ')')) {
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
