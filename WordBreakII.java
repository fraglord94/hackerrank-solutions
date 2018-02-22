package hackerrank.algorithms;

import java.util.*;

public class WordBreakII {
    public List<String> wordBreak(String s, List<String> x) {
        return word_Break(s, new HashSet<>(x), new HashMap<>());
    }

    public List<String> word_Break(String s, Set<String> wordDict, Map<String, List<String>> map) {
        if (map.containsKey(s))
            return map.get(s);

        List<String> result = new ArrayList<>();
        if (s.length() == 0) {
            result.add("");
            return result;
        }
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                List<String> rest = word_Break(s.substring(word.length()), wordDict, map);
                for (String x : rest) {
                    result.add(word + (rest.isEmpty() ? "" : " ") + x);
                    String last = result.remove(result.size()-1);
                    last = last.trim();
                    result.add(last);
                }
            }
        }
        map.put(s, result);
        return result;
    }
}