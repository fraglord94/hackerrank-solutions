package hackerrank.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class Matrix01 {
    final int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {1, 0}};

    public int[][] updateMatrix(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 0)
                    queue.offer(new int[]{i, j});
                else
                    a[i][j] = Integer.MAX_VALUE;

            }
        }
        while (queue.size() != 0) {
            int[] b = queue.poll();
            for (int[] dir : dirs) {
                int x = b[0] + dir[0];
                int y = b[1] + dir[1];
                if (x < 0 || x == m || y < 0 || y == n || a[x][y] <= a[b[0]][b[1]] + 1)
                    continue;
                a[x][y] = a[b[0]][b[1]] + 1;
                queue.offer(new int[]{x, y});
            }
        }
        return a;
    }
}

