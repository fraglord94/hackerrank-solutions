package hackerrank.algorithms;

public class RepeatedSubstring {
    
    static boolean RepeatedSubstring(String s) {
        int lps[] = computeLPS(s);
        int n = s.length();
        int len = lps[n - 1];
        return n % (n - len) == 0;
        
    }
    
    static int[] computeLPS(String string) {
        int M = string.length();
        int i = 1;
        int len = 0;
        int lps[] = new int[M];
        char s[] = string.toCharArray();
        while (i < M) {
            if (s[i] == s[len]) {
                len++;
                lps[i] = len;
                i++;
            } else //if s[len] != s[i]
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
    
    public static void main(String[] args) {
        System.out.println(RepeatedSubstring("abac"));
    }
}
