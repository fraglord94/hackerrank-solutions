package hackerrank.algorithms;

public class ScrambledString {
    public boolean isScramble(String s1, String s2) {
        int n = s1.length();

        if (s1.equals(s2))
            return true;

        int[] a = new int[26];

        for (int i = 0; i < n; i++) {
            a[s1.charAt(i) - 'a']++;
            a[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < a.length; i++)
            if (a[i] != 0)
                return false;


        for (int i = 1; i <= n; i++) {
            return (isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i, n), s2.substring(i, n))) ||
                    (isScramble(s1.substring(0, i), s2.substring(n - i, n)) && isScramble(s1.substring(n - i, n), s2.substring(0, i)));
        }
        return false;
    }
}
