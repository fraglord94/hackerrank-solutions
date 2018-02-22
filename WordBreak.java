package hackerrank.algorithms;

import java.util.List;
import java.util.Set;

public class WordBreak {
    private static boolean find(String s, List<String> words) {
        if (words.contains(s))
            return true;
        return false;
    }

    public boolean wordBreakRec(String s, List<String> wordDict) {
        if (s.length() == 0)
            return true;
        int n = s.length();
        for (int i = 1; i <= n; i++) {
            if (find(s.substring(0, i), wordDict)
                    && wordBreakRec(s.substring(i), wordDict))
                return true;
        }
        return false;
    }

    public boolean wordBreak(String s, Set<String> words) {
        boolean dp[] = new boolean[s.length() + 1];
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String word = s.substring(j, i);
                if (!dp[j])
                    continue;
                if (dp[j] && words.contains(word)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }
}