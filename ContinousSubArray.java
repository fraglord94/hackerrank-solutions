package hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;

public class ContinousSubArray {
    public boolean checkSubarraySum(int[] a, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            if (k != 0)
                sum = sum % k;
            Integer prev = map.get(sum);
            if (prev != null) {
                if (prev - i > 1)
                    return true;
            }
            map.put(sum, i);
        }
        return false;
    }
}
