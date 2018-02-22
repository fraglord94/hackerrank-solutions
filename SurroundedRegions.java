package hackerrank.algorithms;

import java.util.ArrayDeque;
import java.util.Queue;

public class SurroundedRegions {
    public void solve(char[][] a) {
        if (a.length == 0 || a[0].length == 0)
            return;
        if (a.length < 2 || a[0].length < 2)
            return;
        Queue<int[]> queue = new ArrayDeque<>();
        int m = a.length, n = a[0].length;
        for (int i = 0; i < m; i++) {
            if (a[i][0] == 'O')
                queue.offer(new int[]{i, 0});
            if (a[i][n - 1] == 'O')
                queue.offer(new int[]{i, n - 1});
        }
        for (int i = 0; i < n; i++) {
            if (a[0][i] == 'O')
                queue.offer(new int[]{0, i});
            if (a[m - 1][i] == 'O')
                queue.offer(new int[]{m - 1, i});
        }

        while (queue.size() != 0) {
            int[] b = queue.poll();
            int i = b[0];
            int j = b[1];
            a[i][j] = 'T';
            if (i >= 2 && a[i - 1][j] == 'O')
                queue.add(new int[]{i - 1, j});
            if (j >= 2 && a[i][j - 1] == 'O')
                queue.add(new int[]{i, j - 1});
            if (i <= m - 3 && a[i + 1][j] == 'O')
                queue.add(new int[]{i + 1, j});
            if (j <= n - 3 && a[i][j + 1] == 'O')
                queue.add(new int[]{i, j + 1});
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 'O')
                    a[i][j] = 'X';
                if (a[i][j] == 'T')
                    a[i][j] = 'O';
            }
        }
    }

}
