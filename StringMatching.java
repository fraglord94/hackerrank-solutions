package hackerrank.algorithms;

public class StringMatching {

    public static void main(String[] args) {
        KMPseach("abcasdabcabcbabbacasd", "abcbab");
    }

    static void KMPseach(String text, String pattern) {
        int N = text.length();
        int M = pattern.length();
        int lps[] = computeLps(pattern);
        for (int lp : lps) {
           System.out.print(lp + " ");
        }
        int i = 0;
        int j = 0;
        char[] txt = text.toCharArray();
        char[] pat = pattern.toCharArray();
        while (i < N) {
            if (txt[i] == pat[j]) {
                i++;
                j++;
            }
            if (j == M) {
                System.out.println("found at " + (i - j));
                j = 0;
            } else if (i < N && pat[j] != txt[i]) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i = i + 1;
                }
            }

        }

    }

    static int[] computeLps(String pattern) {
        int lps[] = new int[pattern.length()];
        lps[0] = 0;
        int i = 1;
        int len = 0;
        int M = pattern.length();
        char[] pat = pattern.toCharArray();
        while (i < M) {
            if (pat[i] == pat[len]) {
                len++;
                lps[i] = len;
                i++;
            } else // pattern(i) != pattern(len)
            {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

}
