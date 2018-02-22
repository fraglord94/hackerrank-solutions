package hackerrank.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Boomerangs {
    static int getDistance(int[] a, int[] b) {
        return (int) (Math.pow((a[0] - b[0]), 2) + Math.pow((a[1] - b[1]), 2));
    }

    public int numberOfBoomerangs(int[][] a) {
        Map<Integer, Set<int[]>> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j)
                    continue;
                Set<int[]> set = new HashSet<>();
                set.add(a[i]);
                set.add(a[j]);
                map.put(getDistance(a[i], a[j]), set);
            }
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j)
                    continue;
                int distance = getDistance(a[i], a[j]);
                if (map.containsKey(distance) && map.get(distance).contains(a[i]))
                    count++;
            }
        }
        return count;
    }

}
