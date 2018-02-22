package hackerrank.algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class MapSum {
    private TrieNode root;

    public MapSum() {
        root = new TrieNode();
        int a[] = new int[3];
        List<Integer> al = new ArrayList<>();
        al.addAll(Arrays.stream(a).boxed().collect(Collectors.toList()));

    }

    public void insert(String key, int value) {
        TrieNode current = root;
        for (char c : key.toCharArray()) {
            TrieNode next = current.characterTrieNodeMap.get(c);
            if (next == null) {
                next = new TrieNode();
                current.characterTrieNodeMap.put(c, next);
            }
            current = next;
        }
        current.eoWord = true;
        current.value = value;
    }

    public int sum(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            TrieNode next = current.characterTrieNodeMap.get(c);
            if (next == null)
                return 0;
            current = next;
        }
        return dfs(current);
    }

    public int dfs(TrieNode trieNode) {
        int sum = 0;
        for (char c : trieNode.characterTrieNodeMap.keySet()) {
            sum = sum + dfs(trieNode.characterTrieNodeMap.get(c));
        }
        return sum + trieNode.value;
    }

    class TrieNode {
        private Map<Character, TrieNode> characterTrieNodeMap;
        private boolean eoWord;
        private int value;

        public TrieNode() {
            this.characterTrieNodeMap = new HashMap<>(26);
            this.eoWord = false;
            this.value = 0;
        }
    }
}