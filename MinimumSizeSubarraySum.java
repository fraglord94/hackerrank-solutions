package hackerrank.algorithms;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] a) {
        if(a == null || a.length == 0)
            return 0;
        int ans = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;
        while (end < a.length) {
            sum = sum + a[end];
            while (sum >= s) {
                ans = Math.min(ans, end - start);
                sum = sum - a[start];
                start--;
            }

        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
