package hackerrank.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SentenceSimilarII {
    public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
        if (words1.length != words2.length)
            return false;
        Map<String, Set<String>> map = new HashMap<>();
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            if (!map.containsKey(word1))
                map.put(word1, new HashSet<>());
            if (!map.containsKey(word2))
                map.put(word2, new HashSet<>());
            Set<String> word1Set = map.get(word1);
            word1Set.add(word2);
            map.put(word1, word1Set);

            Set<String> word2Set = map.get(word2);
            word2Set.add(word1);
            map.put(word2, word2Set);
        }

        for (int i = 0; i < words1.length; i++) {
            String word1 = words1[i];
            String word2 = words2[i];
            if (word1.equals(word2))
                continue;
            if (!dfs(word1, word2, map, new HashSet<>()))
                return false;
        }
        return true;
    }

    private boolean dfs(String word1, String word2, Map<String, Set<String>> map, Set<String> visitedSet) {
        if(!map.containsKey(word1))
            return false;
        if (map.get(word1).contains(word2))
            return true;
        if(visitedSet.contains(word1))
            return false;
        visitedSet.add(word1);
        for (String kid : map.get(word1)) {
            if ( dfs(kid, word2, map, visitedSet))
                return true;
        }
        return false;
    }
}
