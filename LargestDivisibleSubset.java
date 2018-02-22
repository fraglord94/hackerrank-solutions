package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] a) {
        int dp[] = new int[a.length];
        int prev[] = new int[a.length];
        Arrays.sort(a);
        Arrays.fill(a, 1);
        Arrays.fill(prev, -1);
        int minIndex = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] % a[j] == 0) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        prev[i] = j;
                    }
                }
            }
            if (dp[minIndex] < dp[i]) {
                minIndex = i;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int k = minIndex;
        while (k >= 0) {
            ans.add(a[k]);
            k = prev[k];
        }
        return ans;
    }
}
