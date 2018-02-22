package hackerrank.algorithms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class PacificAtlanticWaterFlow {
    final int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public List<int[]> pacificAtlantic(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        Queue<int[]> pacificQueue = new ArrayDeque<>();
        Queue<int[]> atlanticQueue = new ArrayDeque<>();

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            pacificQueue.add(new int[]{i, 0});
            atlanticQueue.add(new int[]{i, n - 1});
            pacific[i][0] = true;
            atlantic[i][n - 1] = true;
        }


        for (int i = 0; i < n; i++) {
            pacificQueue.add(new int[]{0, i});
            atlanticQueue.add(new int[]{m - 1, i});
            pacific[0][i] = true;
            atlantic[m - 1][i] = true;
        }

        bfs(pacific, pacificQueue, m, n, a);
        bfs(atlantic, atlanticQueue, m, n, a);

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j])
                    ans.add(new int[]{i, j});
            }
        }
        return ans;

    }

    void bfs(boolean[][] visited, Queue<int[]> queue, int m, int n, int[][] a) {
        while (queue.size() != 0) {
            int[] current = queue.poll();
            for (int[] dir : dirs) {
                int x = current[0] + dir[0];
                int y = current[1] + dir[1];
                if (x < 0 || x == m || y < 0 || y == n || visited[x][y] || a[x][y] < a[current[0]][current[1]])
                    continue;
                visited[x][y] = true;
                queue.offer(new int[]{x, y});
            }
        }
    }
}
