package hackerrank.algorithms;

public class DistinctSubsequences {
    public int numDistinct(String subsequence, String pattern) {
        int m = pattern.length();
        int n = subsequence.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < dp[0].length; i++)
            dp[0][i] = 1;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                dp[i][j] = dp[i][j - 1];
                if (pattern.charAt(i - 1) == subsequence.charAt(j - 1))
                    dp[i][j] += dp[i - 1][j - 1];
            }
        }
        return dp[m][n];
    }
}
