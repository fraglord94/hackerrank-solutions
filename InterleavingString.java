package hackerrank.algorithms;

public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        return helper(s3.toCharArray(), s1.toCharArray(), s3.toCharArray());

    }


    public boolean helper(char[] s, char[] s1, char[] s2) {
        boolean dp[][] = new boolean[s1.length + 1][s2.length + 1];

        dp[0][0] = true;
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = dp[i - 1][0] && s2[i - 1] == s[i - 1];
        }

        for (int i = 1; i < dp[0].length + 1; i++) {
            dp[0][i] = dp[0][i] && s1[i - 1] == s[i - 1];
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = (dp[i - 1][j] && s1[i - 1] == s[i + j - 1]) || (dp[i][j - 1] && s2[j - 1] == s[i + j - 1]);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];

    }
}
