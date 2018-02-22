package hackerrank.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWord {
    private Map<String, Set<String>> map;

    public UniqueWord(String[] dictionary) {
        map = new HashMap<>();
        for (String s : dictionary) {
            String abbreviation = abbreviate(s);
            Set<String> words = map.containsKey(abbreviation) ? map.get(abbreviation) : new HashSet<>();
            words.add(s);
            map.put(abbreviation, words);
        }
    }

    public boolean isUnique(String word) {
        String abbreviation = abbreviate(word);
        Set<String> set = map.get(abbreviation);
        return set == null || set.size() == 1 && set.contains(word);
    }

    private String abbreviate(String s) {
        if (s.length() <= 2)
            return s;
        return s.charAt(0) + s.length() - 2 + s.charAt(s.length() - 1) + "";
    }
}
