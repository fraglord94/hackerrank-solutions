package hackerrank.algorithms;

public class SearchInRotatedSorted {
    static int ans = -1;

    public int singleNonDuplicate(int[] nums) {
        find(nums, 0, nums.length - 1);
        return ans;
    }

    void find(int[] a, int low, int high) {
        if (low > high)
            return;
        if (low == high) {
            ans = a[low];
            return;
        }

        int mid = (low + high) / 2;
        if (mid % 2 == 0) {
            if (a[mid] == a[mid + 1])
                find(a, mid + 2, high);
            else
                find(a, low, mid);
        } else if (mid % 2 == 1) {
            if (a[mid] == a[mid - 1])
                find(a, mid + 1, high);
            else
                find(a, low, mid - 1);
        }

    }

}
