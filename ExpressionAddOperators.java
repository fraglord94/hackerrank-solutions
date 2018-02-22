package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperators {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        if (num == null || num.length() == 0)
            return ans;
        find("", ans, 0, 0L, 0, target, num);
        return ans;
    }

    void find(String temp, List<String> ans, int start, long value, long prev, int target, String string) {
        if (string.length() == start) {
            if (value == target) {
                ans.add(temp);
                return;
            }
        }
        for (int i = start; i < string.length(); i++) {
            if (string.charAt(start) == '0' && i != start)
                break;
            long curr = Long.valueOf(string.substring(start, i + 1));
            if (i == 0)
                find(temp + curr, ans, i + 1, value + curr, curr, target, string);
            else {
                find(temp + "+" + curr, ans, i + 1, value + curr, curr, target, string);
                find(temp + "-" + curr, ans, i + 1, value - curr, -curr, target, string);
                find(temp + "*" + curr, ans, i + 1, value - prev + prev * curr, prev * curr, target, string);

            }
        }
    }
}
