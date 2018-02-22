package hackerrank.algorithms;

public class RegexMatching {


    public boolean isMatch(String s, String p) {
        char[] a = s.toCharArray();
        char[] b = p.toCharArray();
        boolean[][] dp = new boolean[s.length() + 1][b.length + 1];


        dp[0][0] = true;
        for (int i = 1; i < dp[0].length; i++) {
            if (b[i - 1] == '*')
                dp[0][i] = dp[0][i - 2];
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (a[i - 1] == b[j - 1] || b[j - 1] == '.')
                    dp[i][j] = dp[i - 1][j - 1];
                else if (b[j - 1] == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if (b[j - 2] == '.' || b[j - 2] == a[i - 1])
                        dp[i][j] = dp[i][j] || dp[i - 1][j];

                } else
                    dp[i][j] = false;
            }
        }
        return dp[s.length()][p.length()];
    }

}
