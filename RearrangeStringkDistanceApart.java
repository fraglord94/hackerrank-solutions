package hackerrank.algorithms;

import java.util.*;
import java.util.LinkedList;

public class RearrangeStringkDistanceApart {
    public String rearrangeString(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Queue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((o1, o2) -> -o1.getValue() + o2.getValue());
        Queue<Map.Entry<Character, Integer>> queue = new LinkedList<>();
        for (Map.Entry<Character, Integer> mapEntry : map.entrySet()) {
            maxHeap.offer(mapEntry);
        }
        StringBuilder sb = new StringBuilder();

        while (maxHeap.size() != 0) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            Character c = entry.getKey();
            sb.append(c);
            entry.setValue(entry.getValue() - 1);

            queue.offer(entry);

            if (queue.size() < k)
                continue;

            Map.Entry<Character, Integer> e = queue.poll();
            if (e.getValue() > 0) {
                maxHeap.offer(e);
            }

        }

        return sb.toString().length() == s.length() ? sb.toString() : "";
    }
}
