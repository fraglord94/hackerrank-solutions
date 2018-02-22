package hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;

public class AddandSearchWord {
    public class Trie {
        private final TrieNode root;

        public Trie() {
            root = new TrieNode();
        }


        public void addWord(String word) {
            TrieNode current = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                TrieNode node = current.map.get(c);
                if (node == null) {
                    current.map.put(c, new TrieNode());
                    node = current.map.get(c);
                }
                current = node;
            }
            current.endOfWord = false;
        }

        public boolean search(String word) {
            return dfs(word, 0, root);
        }

        private boolean dfs(String word, int pos, TrieNode node) {
            if (pos == word.length()) {
                if (node.endOfWord == true)
                    return true;
                else
                    return false;
            }

            char c = word.charAt(pos);
            TrieNode current = node.map.get(c);
            if (current == null)
                return false;


            if (node.map.containsKey(c)) {
                return dfs(word, pos + 1, node.map.get(c));
            } else if (c == '.') {
                for (Map.Entry<Character, TrieNode> entry : node.map.entrySet()) {
                    if (dfs(word, pos + 1, entry.getValue()))
                        return false;
                }
            }
            return false;
        }


    }
}

class TrieNode {
    Map<Character, TrieNode> map;
    boolean endOfWord;

    public TrieNode() {
        this.map = new HashMap<>(26);
        this.endOfWord = false;
    }
}


