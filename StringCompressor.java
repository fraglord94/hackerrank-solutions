package hackerrank.algorithms;

public class StringCompressor {
    public int compress(char[] a) {
        int i = 0;
        int j = 0;
        int k = 0;
        int n = a.length;
        while (i < n) {
            j = i;
            while (j < n && a[i] == a[j])
                j++;
            a[k++] = a[i];
            if (j - i >= 2) {
                String s = String.valueOf(j - i);
                char number[] = s.toCharArray();
                for (char c : number) {
                    a[k++] = c;
                }
            }
            i = j;

        }
        return k;
    }
}
