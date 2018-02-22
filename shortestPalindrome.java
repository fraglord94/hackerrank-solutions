package hackerrank.algorithms;

public class shortestPalindrome {
    public String shortestPalindrome(String s) {
        String rev = (new StringBuilder(s)).reverse().toString();
        String x = s + "#" + rev;
        int[] lps = new int[x.length()];
        char[] a = x.toCharArray();
        for (int i = 1; i < x.length(); i++) {
            int j = lps[i - 1];
            while (j > 0 && a[j] != a[i])
                j = lps[j - 1];
            if (a[i] == a[j])
                lps[i] = j + 1;
        }
        return rev.substring(0, s.length() - lps[lps.length - 1]) + s;

    }

    public String caller(String s) {
        int n = finder(s);
        String rev = (new StringBuilder(s)).reverse().toString();
        rev = rev.substring(0, n + 1);
        return rev + s;
    }

    public int finder(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        for (int i = n - 1; i >= 0; i++) {
            if (isPalin(a, 0, i))
                return (n - i - 1);
        }
        return 1;
    }

    private boolean isPalin(char[] a, int left, int right) {
        while (left < right) {
            if (a[left] != a[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
