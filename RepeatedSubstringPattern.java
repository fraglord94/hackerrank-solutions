/*
 * 
 * 
 * 
 */
package hackerrank.algorithms;

/**
 *
 * @author aronee
 */
public class RepeatedSubstringPattern {

    static boolean repeatedSubtringPattern(String string) {

        int n = string.length();

        if (n % 2 == 0) {
            int m = n / 2;
            String firstHalf = new StringBuilder(string.substring(0, n / 2)).toString();
            String secondHalf = new StringBuilder(string.substring(n / 2 + 0, n)).toString();
            return firstHalf.equals(secondHalf);
        } //odd length
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubtringPattern("abcabcabcabc"));

        System.out.println(repeatedSubtringPattern("abcab"));
    }
}
