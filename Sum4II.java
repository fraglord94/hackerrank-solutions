package hackerrank.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sum4II {

    public static void main(String[] args) {

    }

    static int fourSumCount(int a[], int b[], int c[], int d[]) {
        Set<Integer> map = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                int sum = a[i] + b[j];
                map.add(sum);
            }
        }
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < d.length; j++) {
                int target = -1 * (c[i] + d[j]);
                if (map.contains(target) == true) {
                    count++;
                }

            }
        }

        return count;

    }

}
