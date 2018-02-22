package hackerrank.algorithms;

import java.util.*;

public class AlienDictionary {
    public String alienOrder(String[] words) {
        Map<Character, Set<Character>> map = new LinkedHashMap<>();


        for (String s : words) {
            for (char c : s.toCharArray()) {
                map.put(c, new HashSet<>());
            }
        }
        for (String s : words) {
            char parent = s.charAt(0);
            for (int i = 0; i < s.length(); i++) {
                char kid = s.charAt(i);
                Set<Character> kids = map.get(parent);
                kids.add(kid);
                map.put(parent, kids);
            }
        }
        Set<Character> visitedSet = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        for (Map.Entry<Character, Set<Character>> entry : map.entrySet()) {
            char node = entry.getKey();
            if (visitedSet.contains(node))
                continue;
            topSortUtil(node, visitedSet, stack, map);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (stack.size() != 0)
            stringBuilder.append(stack.pop());
        return stringBuilder.toString();
    }

    void topSortUtil(char parent, Set<Character> visitedSet, Stack<Character> stack, Map<Character, Set<Character>> map) {
        visitedSet.add(parent);
        Set<Character> kids = map.get(parent);
        for (char kid : kids) {
            if (visitedSet.contains(kid))
                continue;
            topSortUtil(kid, visitedSet, stack, map);
        }
        stack.push(parent);
    }
}
