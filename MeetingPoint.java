package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeetingPoint {
    public int minTotalDistance(int[][] a) {
        List<Integer> xlist = new ArrayList<>();
        List<Integer> ylist = new ArrayList<>();

        int m = a.length;
        int n = a[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    xlist.add(i);
                    ylist.add(j);
                }
            }
        }
        Collections.sort(xlist);
        Collections.sort(ylist);

        int i = 0;
        int j = xlist.size() - 1;
        int xd = 0;
        while (i < j) {
            xd += xlist.get(j) - xlist.get(i);
            j--;
            i++;
        }

        int p = 0;
        int q = ylist.size() - 1;
        int yd = 0;
        while (p < q) {
            yd += ylist.get(p) - ylist.get(q);
            q--;
            p++;
        }

        return Math.abs(yd) + Math.abs(xd);
    }
}
