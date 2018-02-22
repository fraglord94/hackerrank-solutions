package hackerrank.algorithms;

public class ShortestWordDistanceIII {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int m = -1;
        int n = -1;
        int index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (!word1.equals(word2)) {
                if (word1.equals(words[i])) m = i;
               else if (word2.equals(words[i])) n = i;
                if (m != -1 && n != -1)
                    min = Math.min(min, Math.abs(m - n));
            } else if (word1.equals(word2)) {
                if (words[i].equals(word1)) {
                    if (index != -1) {
                        min = Math.min(min, Math.abs(index - i));
                        index = i;
                    }
                }
            }
        }
        return min;
    }
}
