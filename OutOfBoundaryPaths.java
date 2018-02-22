package hackerrank.algorithms;

public class OutOfBoundaryPaths {
    public int findPaths(int m, int n, int N, int i0, int j0) {
        long dp[][][] = new long[N + 1][m][n];
        long limit = 1000000007;
        for (int steps = 1; steps <= N; steps++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    dp[steps][i][j] += i == 0 ? 1 : dp[steps - 1][i - 1][j];
                    dp[steps][i][j] += i == m - 1 ? 1 : dp[steps - 1][i + 1][j];
                    dp[steps][i][j] += j == 0 ? 1 : dp[steps - 1][i][j - 1];
                    dp[steps][i][j] += j == n - 1 ? 1 : dp[steps - 1][i][j + 1];
                    dp[steps][i][j] %= limit;
                }
            }
        }
        return (int)dp[N][i0][j0];

    }
}
