package hackerrank.algorithms;

import java.util.*;

public class RemoveInvalidParenthesis {
    public List<String> removeInvalidParentheses(String s) {
        Queue<String> queue = new ArrayDeque<>();
        List<String> ans = new ArrayList<>();
        Set<String> visitedSet = new HashSet<>();
        List<String> result = new ArrayList<>();
        queue.offer(s);
        visitedSet.add(s);
        boolean found = false;
        while (queue.size() != 0) {
            String current = queue.poll();
            if (isValid(current)) {
                ans.add(current);
                found = true;
            } else {
                for (int i = 0; i < current.length(); i++) {
                    if (current.charAt(i) != '(' && current.charAt(i) != ')')
                        continue;
                    String broken = current.substring(0, i) + current.substring(i + 1);
                    if (!visitedSet.contains(broken)) {
                        queue.offer(broken);
                        visitedSet.add(broken);
                    }
                }
            }
        }
        int max = ans.get(0).length();
        for (String string : ans) {
            if (string.length() == max)
                result.add(string);
        }
        return result;
    }

    boolean isValid(String s) {
        int open = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                open++;
            if (s.charAt(i) == ')') {
                if (open == 0)
                    return false;
                open--;
            }
        }
        return open == 0;
    }
}
