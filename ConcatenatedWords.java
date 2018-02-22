package hackerrank.algorithms;

import java.util.*;

public class ConcatenatedWords {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));

        List<String> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();


        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (search(word, set))
                ans.add(word);
            set.add(word);
        }
        return ans;
    }

    boolean search(String candidate, Set<String> set) {
        boolean dp[] = new boolean[candidate.length() + 1];
        dp[0] = true;
        for (int i = 1; i < candidate.length() + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (!dp[j])
                    continue;
                if (set.contains(candidate.substring(j, i)))
                    dp[i] = true;
            }
        }
        return dp[dp.length - 1];
    }
}
