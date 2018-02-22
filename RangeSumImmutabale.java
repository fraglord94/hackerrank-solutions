package hackerrank.algorithms;

public class RangeSumImmutabale {
    int[] a;

    public RangeSumImmutabale(int[] nums) {
        a = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        this.a = nums;
    }

    public int sumRange(int i, int j) {
        if (i == 0)
            return a[j];
        return a[j] - a[i - 1];
    }
}
