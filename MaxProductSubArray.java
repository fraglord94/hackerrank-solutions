package hackerrank.algorithms;

public class MaxProductSubArray {
    public int maxProduct(int[] a) {
        int max = a[0];
        int min = a[0];
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            int temp = max;
            max = Math.max(a[i], Math.max(a[i] * max, a[i] * min));
            min = Math.min(a[i], Math.min(a[i] * temp, a[i] * min));
            res = Math.max(max, res);
        }
        return res;
    }
}
