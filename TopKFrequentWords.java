package hackerrank.algorithms;

import java.util.*;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else
                map.put(s, 1);
        }
        Queue<Map.Entry<String, Integer>> queue = new PriorityQueue<>((o1, o2) -> Objects.equals(o1.getValue(), o2.getValue()) ?
                o1.getKey().compareTo(o2.getKey()) : o1.getValue() - o2.getValue());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            queue.offer(entry);
        }
        List<String> ans = new ArrayList<>();
        while (k > 0) {
            ans.add(queue.poll().getKey());
            k--;
        }
        return ans;
    }
}
