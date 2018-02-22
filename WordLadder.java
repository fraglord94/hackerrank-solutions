package hackerrank.algorithms;

import java.util.*;
import java.util.LinkedList;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> w) {
        Set<String> wordList = new HashSet<>(w);
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.remove();
                if (cur.equals(endWord)) {
                    return level + 1;
                }
                for (int j = 0; j < cur.length(); j++) {
                    char[] word = cur.toCharArray();
                    for (char ch = 'a'; ch < 'z'; ch++) {
                        word[j] = ch;
                        String check = new String(word);
                        if (!check.equals(cur) && wordList.contains(check)) {
                            queue.add(check);
                            wordList.remove(check);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }
}
