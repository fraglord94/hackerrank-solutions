package hackerrank.algorithms;

public class firstunique {

    public static int unique(String string) {
        int n = string.length();
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return 0;
        }
        int a[] = new int[26];
        for (int i = 0; i < n; i++) {
            a[string.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            if (a[string.charAt(i) - 'a'] == 1) {
                //ans = i;
                return i;
            }
        }
        return -1;

    }
}
