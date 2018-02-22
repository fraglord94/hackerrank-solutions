package hackerrank.algorithms;

public class UglyNumber {
    public int nthUglyNumber(int n) {
        int[] a = new int[n];
        a[0] = 1;
        int id2 = 0, id3 = 0, id5 = 0;
        int n2 = 2;
        int n3 = 3;
        int n5 = 5;
        int next = 1;
        for (int i = 1; i < n; i++) {
            next = Math.min(n2, Math.min(n3, n5));
            a[i] = next;
            if (next == n2) {
                id2++;
                n2 = a[id2] * 2;
            }
            if (next == n3) {
                id3++;
                n3 = a[id3] * 3;
            }

            if (next == n5) {
                id5++;
                n5 = a[id5] * 5;
            }
        }
        return next;
    }
}
