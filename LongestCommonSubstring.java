package hackerrank.algorithms;

public class LongestCommonSubstring {
    public int longestCommonSubstring(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        int ans = 0;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else
                    dp[i][j] = 0;
            }
        }
        return ans;
    }
}

