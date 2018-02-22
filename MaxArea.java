package hackerrank.algorithms;

import java.util.HashSet;
import java.util.Set;

class MaxArea {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        Set<String> visited = new HashSet<>();
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(i, j, grid, visited));
                }
            }
        return max;
    }

    int dfs(int i, int j, int[][] a, Set<String> visited) {
        if (i < 0 || i == a.length || j < 0 || j == a[0].length || visited.contains(i + " " + j))
            return 0;
        else {
            visited.add(i + " " + j);
            return 1 +
                    dfs(i + 1, j, a, visited) +
                    dfs(i - 1, j, a, visited) +
                    dfs(i, j + 1, a, visited) +
                    dfs(i, j - 1, a, visited);
        }
    }
}