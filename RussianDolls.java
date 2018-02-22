package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class RussianDolls {
    public int maxEnvelopes(int[][] a) {
        if (a == null || a.length == 0 || a[0] == null || a[0].length == 0) {
            return 0;
        }
        Arrays.sort(a, Comparator.comparingInt(o -> o[0]));
        int dp[] = new int[a.length];
        Arrays.fill(dp, 1);
        int n = a.length;
        int ans = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i][1] > a[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
