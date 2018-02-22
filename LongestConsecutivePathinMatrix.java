package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestConsecutivePathinMatrix {
    int[][] dirs = {{1, 0}, {0, 1}, {1, 1}, {1, -1}};

    public int findMax(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res = Math.max(res, bfsFind(i, j, a, m, n));
            }
        }
        return res;
    }

    int bfsFind(int i, int j, int a[][], int m, int n) {
        int res = 1;
        for (int[] dir : dirs) {
            int x = i + dir[0];
            int y = j + dir[1];
            int count = 1;
            while (x >= 0 && x < m && y >= 0 && y < n && a[x][y] == 1) {
                x = x + dir[0];
                y = y + dir[1];
                count++;
            }
            res = Math.max(res, count);

            List<Integer> al = new ArrayList<>();

        }
        return res;
    }
}
