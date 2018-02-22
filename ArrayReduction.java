package hackerrank.algorithms;

import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayReduction {
    static int reductionCost(int[] a) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int x : a)
            pq.offer(x);
        int cost = 0;
        while (pq.size() != 1) {
            int first = pq.poll();
            int second = pq.poll();
            cost += first + second;
            pq.offer(first + second);

        }
        return cost;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(reductionCost(a));
    }
}
