package hackerrank.algorithms;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestElementinaSortedMatrix {
    public int kthSmallest(int[][] a, int k) {
        Queue<Pair> queue = new PriorityQueue<>(k, Comparator.comparingInt(o -> o.val));
        int m = a.length;
        int n = a[0].length;

        for (int i = 0; i < n; i++) {
            queue.offer(new Pair(0, i, a[0][i]));
        }
        for (int i = 0; i < k - 1; i++) {
            Pair p = queue.poll();
            if (p.x == n - 1)
                continue;
            queue.offer(new Pair(p.x + 1, p.y, a[p.x + 1][p.y]));

        }
        return queue.poll().val;
    }

    class Pair {
        int x;
        int y;
        int val;

        public Pair(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }
    }
}
