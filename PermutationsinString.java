package hackerrank.algorithms;

public class PermutationsinString {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if (m > n)
            return false;
        int[] count = new int[26];

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        for (int i = 0; i < m; i++) {
            count[a[i] - 'a']++;
            count[b[i] - 'a']--;
        }
        if (check(count))
            return true;
        for (int i = m; i < n; i++) {
            count[b[i] - 'a']--;
            count[b[i] - m - 'a']++;
            if (check(count))
                return true;
        }
        return false;
    }


    private boolean check(int[] a) {
        for (int i : a) {
            if (i != 0)
                return false;
        }
        return true;
    }
}
