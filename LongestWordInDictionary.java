package hackerrank.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestWordInDictionary {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> dictionary = new HashSet<>();
        String ans = words[0];
        for (String word : words) {
            String x = word.substring(0, word.length() - 1);
            if (dictionary.contains(x) || word.length() == 1) {
                ans = word.length() > ans.length() ? word : ans;
                dictionary.add(word);
            }
        }
        return ans;
    }
}
