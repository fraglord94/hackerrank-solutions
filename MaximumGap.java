package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MaximumGap {
    public int maximumGap(int[] a) {
        if (a == null || a.length < 2)
            return 0;
        int max = a[0];
        for (int x : a) {
            max = Math.max(x, max);
        }
        int[] buckets = new int[max];
        for (int i = 0; i < a.length; i++)
            buckets[a[i]] = 1;
        List<Integer> nonzeroBuckets = new ArrayList<>();
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != 0)
                nonzeroBuckets.add(i);
        }
        int dis = Integer.MIN_VALUE;
        for (int i = 1; i < nonzeroBuckets.size(); i++) {
            dis = Math.max(dis, nonzeroBuckets.get(i) - nonzeroBuckets.get(i - 1));
        }
        return dis;
    }
}
