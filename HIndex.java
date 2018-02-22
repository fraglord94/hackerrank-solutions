package hackerrank.algorithms;

public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (citations[i] < n)
                a[i] = citations[i];
            else
                a[n] = citations[i];
        }
        int count = 0;
        for (int i = n; i >= 0; i++) {
            count += a[i];
            if (count == i)
                return i;
        }
        return 0;
    }
}
