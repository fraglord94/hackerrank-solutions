package hackerrank.algorithms;

public class WildcardMatching {
    public boolean isMatch(String string, String pattern) {
        int m = string.length();
        int n = pattern.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        char[] s = string.toCharArray();
        char[] p = pattern.toCharArray();
        dp[0][0] = true;
        for (int i = 0; i <= n; i++) {
            if (p[i - 1] == '*')
                dp[0][i] = dp[0][i - 1];
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p[j - 1] == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else if (p[j - 1] == '?' || s[i - 1] == p[j - 1]) {
                    dp[i][j] = dp[i-1][j-1];
                } else
                    dp[i][j] = false;
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}

