package hackerrank.algorithms;

public class TrappingRainWater {
    public int trap(int[] a) {
        int n = a.length;
        int left[] = new int[n];
        left[0] = a[0];
        int right[] = new int[n];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], a[i]);
        }

        right[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i++) {
            right[i] = Math.max(right[i + 1], a[i]);
        }

        int water = 0;
        for (int i = 0; i < a.length; i++) {
            water += Math.min(left[i], right[i]) - a[i];
        }
        return water;
    }
}
