package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum3 {

    public static void main(String[] args) {
        int A[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = sum3(A);
        for (List<Integer> an : ans) {
            System.out.println(an.get(0) + " " + an.get(1) + " " + an.get(2));
        }
    }

    static List<List<Integer>> sum3(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> r = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int low = i + 1;
            int high = nums.length - 1;
            int sum = -nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == sum) {
                    List<Integer> x = new ArrayList<Integer>();
                    x.add(nums[i]);
                    x.add(nums[low]);
                    x.add(nums[high]);
                    r.add(x);
                    while (low < high && nums[low] == nums[low + 1]) {
                        low++;
                    }
                    while (low < high && nums[high] == nums[high - 1]) {
                        high--;
                    }
                    low++;
                    high--;
                }
                else if(nums[low] + nums[high] < sum)
                    low++;
                else; 
                    high--;

            }
        }
        return r;
    }
}
