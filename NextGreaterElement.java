import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] find, int[] a) {
        if (a.length == 0)
            return a;
        Stack<Integer> stack = new Stack<>();
        stack.push(a[0]);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < a.length; i++) {
            int next = a[i];
            if (!stack.isEmpty()) {
                int prev = stack.pop();
                while (prev < next) {
                    map.put(prev, next);
                    if (stack.isEmpty())
                        break;
                    prev = stack.pop();
                }

                if (prev > next)
                    stack.push(prev);
                stack.push(next);
            }

            while (!stack.isEmpty()) {
                map.put(stack.pop(), -1);
            }
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        for (int i = 0; i < find.length; i++) {
            find[i] = map.getOrDefault(find[i], -1);
        }
        return find;
    }
}
