package hackerrank.algorithms;

import java.util.Stack;

public class BasicCalculator {
    public int calculate(String s) {
        int result = 0;
        int sign = 1;
        int number = 0;
        Stack<Integer> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            number = 0;
            if (Character.isDigit(c)) {
                number = Integer.parseInt(c + "") * 10 + number;
            } else if (c == '+') {
                result = result + sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                result = result + sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if (c == ')') {
                result = result + sign * number;
                result = result * stack.pop();
                result = result + stack.pop();

            }
        }
        if (number != 0)
            result = result + sign * number;
        return result;
    }
}
