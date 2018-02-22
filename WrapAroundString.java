package hackerrank.algorithms;

public class WrapAroundString {
    public int findSubstringInWraproundString(String p) {
        int[] a = new int[26];
        char[] c = p.toCharArray();
        int n = p.length();
        for (int i = 0; i < p.length(); i++) {
            for (int j = i; j < n; j++) {
                if (j > i) {
                    int x = c[j - 1];
                    int y = c[j];
                    if (Math.abs(x - y) != 1)
                        break;
                }
                a[c[i] - 'a'] = Math.max(a[c[i] - 'a'], Math.abs(i - j + 1));
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++)
            count += a[i];
        return count;
    }
}
