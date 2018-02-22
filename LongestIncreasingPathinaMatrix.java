package hackerrank.algorithms;

public class LongestIncreasingPathinaMatrix {

    static int dfs(int i, int j, int[][] a, int[][] dp, int previous) {
        if (i < 0 || j < 0 || i == a.length || j == a[0].length || a[i][j] < previous)
            return 0;
        if (dp[i][j] != 0)
            return 0;
        else {
            int x = 0;
            previous = a[i][j];
            x = Math.max(dfs(i - 1, j, a, dp, previous), x);
            x = Math.max(dfs(i + 1, j, a, dp, previous), x);
            x = Math.max(dfs(i, j - 1, a, dp, previous), x);
            x = Math.max(dfs(i, j + 1, a, dp, previous), x);
            dp[i][j] = x + 1;
            return x;
        }
    }

    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int max = 0;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = dfs(i, j, matrix, dp, Integer.MAX_VALUE);
            }
        }
        return max;
    }

}

