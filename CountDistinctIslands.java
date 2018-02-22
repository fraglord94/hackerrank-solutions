package hackerrank.algorithms;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctIslands {
    public int numDistinctIslands(int[][] grid) {
        Set<String> set = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                StringBuilder sb = new StringBuilder();
                if (grid[i][j] == 1) {
                    dfs(sb, i, j, 0, 0, grid);
                    if (!set.contains(sb.toString()))
                        ans++;
                    set.add(sb.toString());
                }
            }
        }
        return ans;
    }

    void dfs(StringBuilder shape, int x, int y, int dx, int dy, int[][] a) {
        if (x < 0 || x == a.length || y < 0 || y == a[0].length || a[x][y] == 0)
            return;
        a[x][y] = 0;
        shape.append(dx + "" + dy);
        dfs(shape, x + 1, y, dx + 1, dy, a);
        dfs(shape, x - 1, y, dx - 1, dy, a);
        dfs(shape, x, y + 1, dx, dy + 1, a);
        dfs(shape, x, y - 1, dx, dy - 1, a);


    }
}
