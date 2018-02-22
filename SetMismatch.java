package hackerrank.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        System.out.println(sum);
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int x : nums){
            if(set.contains(x)){
                ans = x;
            }
            sum = sum - x;
            set.add(x);
        }
        return new int[]{ans,ans + sum };
    }
}
