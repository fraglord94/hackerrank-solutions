package hackerrank.algorithms;

import java.util.Arrays;

public class CoinChangeMinimum {
    public int coinChange(int[] coins, int amount) {
        return helper(coins, amount);
    }

    private int helper(int[] a, int k) {
        int[] dp = new int[k + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < i; j++) {
                if (a[j] <= i) {
                    int temp = dp[i - a[j]];
                    if (temp != Integer.MAX_VALUE && temp + 1 < dp[i])
                        dp[i] = temp + 1;
                }
            }
        }
        return dp[k];
    }
}
