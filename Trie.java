package hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private final TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    void insert(String s) {
        TrieNode current = root;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            TrieNode node = current.map.get(c);
            if (node == null) {
                node = new TrieNode();
                current.map.put(c, node);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    boolean search(String s) {
        TrieNode current = root;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            TrieNode node = current.map.get(c);
            if (node == null)
                return false;
            current = node;
        }
        return current.endOfWord == true;
    }

    boolean startsWith(String s) {
        TrieNode current = root;
        int i;
        for (i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            TrieNode node = current.map.get(c);
            if (node == null)
                break;
            current = node;
        }
        if (i == s.length())
            return true;
        else
            return false;
    }


    private class TrieNode {
        Map<Character, TrieNode> map;
        boolean endOfWord;

        TrieNode() {
            map = new HashMap<>();
            endOfWord = false;
        }
    }
}

