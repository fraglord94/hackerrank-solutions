package hackerrank.algorithms;

import java.util.ArrayDeque;
import java.util.Queue;

public class WallsAndGates {
    private static int[][] d = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public void wallsAndGates(int[][] a) {
        Queue<int[]> queue = new ArrayDeque<int[]>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 0)
                    queue.offer(new int[]{i, j});
            }
        }
        while (queue.size() != 0) {
            int[] coordinates = queue.poll();
            int x = coordinates[0];
            int y = coordinates[1];
            if (x > 0 && a[x - 1][y] == Integer.MAX_VALUE) {
                a[x - 1][y] = a[x][y] + 1;
                queue.offer(new int[]{x - 1, y});
            }

            if (x < a.length - 1 && a[x + 1][y] == Integer.MAX_VALUE) {
                a[x + 1][y] = a[x][y] + 1;
                queue.offer(new int[]{x + 1, y});
            }

            if (y > 0 && a[x][y - 1] == Integer.MAX_VALUE) {
                a[x][y - 1] = a[x][y] + 1;
                queue.offer(new int[]{x, y - 1});
            }

            if (y < a[0].length - 1 && a[x][y + 1] == Integer.MAX_VALUE) {
                a[x][y + 1] = a[x][y] + 1;
                queue.offer(new int[]{x, y + 1});
            }

        }

    }

    public void wallsAndGates2(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 0)
                    dfs(a, i, j, a.length, a[0].length);
            }
        }
    }

    void dfs(int[][] a, int i, int j, int m, int n) {
        for (int[] dir : d) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (x >= 0 && x != m && y >= 0 && y <= n && a[x][y] > a[i][j] + 1) {
                a[x][y] = 1 + a[i][j];
                dfs(a, x, y, m, n);
            }
        }
    }

}
