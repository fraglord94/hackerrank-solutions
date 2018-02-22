package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                String part1 = input.substring(0, i);
                String part2 = input.substring(i + 1);
                List<Integer> retPart1 = diffWaysToCompute(part1);
                List<Integer> retPart2 = diffWaysToCompute(part2);
                for (int x : retPart1) {
                    for (int y : retPart2) {
                        int temp = 0;
                        switch (c) {
                            case '+':
                                temp = (x + y);
                                break;
                            case '-':
                                temp = (x - y);
                                break;
                            case '*':
                                temp = (x * y);
                                break;
                        }
                        ans.add(temp);
                    }
                }

            }
        }
        return ans.size() == 0 ? new ArrayList<>(Integer.valueOf(input)) : ans;
    }
}
