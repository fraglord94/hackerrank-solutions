package hackerrank.algorithms;

import java.util.Arrays;

public class SubsetSum {
    public boolean canPartition(int[] a) {
        int sum = Arrays.stream(a).sum();
        if (sum % 2 != 0)
            return false;
        sum = sum / 2;
        boolean[][] dp = new boolean[sum + 1][a.length + 1];
        for (int i = 0; i < dp[0].length; i++)
            dp[0][i] = true;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if ((i - a[j - 1]) >= 0) {
                    dp[i][j] = dp[i - a[j - 1]][j - 1] || dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[dp.length][dp[0].length];
    }
}
