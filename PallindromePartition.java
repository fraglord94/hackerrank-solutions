package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class PallindromePartition {
    static void backtrack(String s, int start, List<String> temp, List<List<String>> ans) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(temp));
            return;

        } else {
            for (int i = start; i < s.length(); i++) {
                if (isPalindrome(s, start, i)) {
                    temp.add(s.substring(start, i + 1));
                    backtrack(s, i + 1, temp, ans);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }

    static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), ans);
        return ans;
    }
}
