package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MazeII {
    public int shortestDistance(int[][] a, int[] start, int[] destination) {
        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int m = a.length;
        int n = a[0].length;
        int[][] dp = new int[m][n];
        for (int[] x : dp)
            Arrays.fill(x, Integer.MAX_VALUE);
        Queue<Point> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.distance));
        pq.offer(new Point(start[0], start[1], 0));
        while (pq.size() != 0) {
            Point p = pq.poll();
            if (p.distance < dp[p.x][p.y])
                continue;
            dp[p.x][p.y] = p.distance;
            for (int[] dir : dirs) {
                int x = p.x;
                int y = p.y;
                int count = 0;
                while (x >= 0 && y >= 0 && x <= m && y <= n && a[x][y] == 0) {
                    x = x + dir[0];
                    y = y + dir[1];
                    count++;
                }
                x = x - dir[0];
                y = y - dir[1];
                count--;
                pq.offer(new Point(x, y, count));
            }
        }
        int ans = dp[destination[0]][destination[1]];
        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }

    class Point {
        private int x;
        private int y;
        private int distance;

        public Point(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}