package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfWaysToBurstBalloons {
    public int findMinArrowShots(int[][] a) {
        Arrays.sort(a, Comparator.comparingInt(o -> o[0]));
        int count = 0;
        int[] prev = a[0];
        int prevend = a[0][1];
        for (int i = 1; i < a.length; i++) {
            if (prevend >= a[i][0])
                continue;
            count++;
            prevend = a[i][1];
        }
        return count + 1;
    }
}
