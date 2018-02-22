package hackerrank.algorithms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        int a[] = new int[]{1, 2, 2, 1};
        int b[] = new int[]{2, 2};
        if (a.length >= b.length) {
            int ans[] = printKPathUtil(a, b);
            for (int an : ans) {
                System.out.print(an + " ");
            }
        } else {
            int ans[] = printKPathUtil(b, a);
            for (int an : ans) {
                System.out.print(an + " ");
            }
        }

    }

    static int[] printKPathUtil(int[] a, int[] b) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i : a) {
            set.add(i);
        }
        int ans[] = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) {
                ans[i] = b[i];
            }
        }
        return ans;
    }

}
