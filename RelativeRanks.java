package hackerrank.algorithms;

import java.util.Arrays;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] a) {
        Pair[] pairs = new Pair[a.length];

        for (int i = 0; i < a.length; i++) {
            pairs[i] = new Pair(a[i], i);
        }
        Arrays.sort(pairs, (o1, o2) -> -o1.x + o2.x);
        String[] ans = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i == 0)
                ans[pairs[i].position] = "Gold Medal";
            else if (i == 1)
                ans[pairs[i].position] = "Silver Medal";
            else if (i == 2)
                ans[pairs[i].position] = "Bronze Medal";
            else
                ans[pairs[i].position] = (i + 1) + "";
        }
        return ans;
    }

    private class Pair {
        private int x;
        private int position;

        public Pair(int x, int position) {
            this.x = x;
            this.position = position;
        }
    }
}
