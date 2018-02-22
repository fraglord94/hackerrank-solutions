import java.util.HashSet;
import java.util.Set;

public class LineReflection {
    public boolean isReflected(int[][] points) {
        Set<String> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] a : points) {
            min = Math.min(min, a[0]);
            max = Math.max(max, a[1]);
            set.add(a[0] + " " + a[1]);
        }

        int sum = min + max;
        for (int[] a : points) {
            if (!set.contains(String.valueOf(sum - a[0] + " " + a[1])))
                return false;
        }
        return true;
    }
}
