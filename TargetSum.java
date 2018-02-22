package hackerrank.algorithms;

public class TargetSum {
    int result = 0;

    public int findTargetSumWays(int[] a, int S) {
        if (a == null || a.length == 0)
            return 0;
        find(a, 0, 0, S, a.length);
        return result;
    }

    private void find(int[] a, int temp, int i, int target, int n) {
        if (i == n) {
            if (temp == target)
                result++;
            return;
        }
        find(a, temp + a[i], i + 1, target, n);
        find(a, temp - a[i], i + 1, target, n);
    }
}
