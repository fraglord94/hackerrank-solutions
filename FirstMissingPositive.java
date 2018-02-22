package hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] a) {
        if(a.length == 0)
            return 1;
        if(a.length == 1 && a[0] > 1 )
            return a[0] - 1;
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], 1);
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        for (int i = min; i <= max; i++) {
            if (i > 0 && !map.containsKey(i))
                return i;
        }
        return max+1;
    }
}
