package hackerrank.algorithms;

import java.util.HashSet;
import java.util.Set;

public class SentenceSimilar {
    public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
        if (words1.length != words2.length)
            return false;

        Set<String> set = new HashSet<>();

        for (String[] pair : pairs) {
            set.add(pair[0] + "#" + pair[1]);
        }

        for (int i = 0; i < words1.length; i++) {
            String word1 = words1[i];
            String word2 = words2[i];
            if (!word1.equals(word2) && !set.contains(word1 + "#" + word2) && !set.contains(word2 + "#" + word1))
                return false;
        }
        return true;
    }
}