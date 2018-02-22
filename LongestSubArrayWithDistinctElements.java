import java.util.HashSet;
import java.util.Set;

public class LongestSubArrayWithDistinctElements {
    static int find(int[] a) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int max = Integer.MAX_VALUE;
        while (j < a.length) {
            if (!set.contains(a[j])) {
                set.contains(a[j]);
                j++;
                max = Math.max(j - i, max);
            } else {
                set.remove(a[i++]);
            }

        }
        return max;
    }
}
