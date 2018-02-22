package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(Interval[] a) {
        Arrays.sort(a, Comparator.comparingInt(o -> o.end));
        int overlappingCount = 1;
        int end = a[0].end;
        for (int i = 1; i < a.length; i++) {
            if (a[i].start >= end)
                continue;
            overlappingCount++;
            end = a[i].end;
        }
        return a.length - overlappingCount;
    }
}
