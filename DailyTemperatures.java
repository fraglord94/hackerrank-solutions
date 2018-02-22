package hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] a) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            while (stack.size() != 0 && a[stack.peek()] < a[i]) {
                map.put(stack.peek(), Math.abs(stack.peek() - i));
                stack.pop();
            }
            stack.push(i);
        }
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = map.getOrDefault(i, 0);
        }
        return ans;
    }
}
