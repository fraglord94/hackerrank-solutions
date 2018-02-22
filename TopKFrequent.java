package hackerrank.algorithms;

import org.junit.Test;

import java.util.*;

/**
 * Created by Aronee Dasgupta on 9/6/2017.
 */
public class TopKFrequent {

//    public List<Integer> topKFrequent(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int x : nums) {
//            map.put(x, map.getOrDefault(x, 0) + 1);
//        }
//        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> (-a.getValue() + b.getValue()));
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            pq.add(entry);
//        }
//        List<Integer> ans = new ArrayList<>();
//        while (k > 0) {
//            ans.add(pq.poll().getKey());
//            k = k - 1;
//        }
//        return ans;
//    }
@Test
public static void MakeTheNumbersMatch(int a, int b, int x, int y) {
    while (a != x && b != y) {
        if (a > x) {
            a--;
        } else {
            a++;
        }
        if (b > y) {
            b--;
        } else {
            b++;
        }
    }
}
    public static void main(String[] args) {
        MakeTheNumbersMatch(1,3,10,12);
    }
}
