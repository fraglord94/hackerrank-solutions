package hackerrank.algorithms;

import java.util.Arrays;

public class SearchForARange {
    public static int[] searchRange(int[] nums, int target) {
        int low = target - 1;
        int high = target + 1;
        int lower = Arrays.binarySearch(nums, low);
        int higher = Arrays.binarySearch(nums, high);
        System.out.println(Math.abs(lower) + " "+ Math.abs(higher));
        return new int[2];
    }

    public static void main(String[] args) {
        int a[] = new int[]{5, 7, 7, 8, 8, 10};
        int [] range = searchRange(a, 8);
    }
}
