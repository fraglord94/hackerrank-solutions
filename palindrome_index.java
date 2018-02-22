/*
 * 
 * 
 * 
 */
package hackerrank.algorithms;

import java.util.Scanner;

/**
 *
 * @author aronee
 */
public class palindrome_index {

    public static void main(String[] args) {
        int t = (new Scanner(System.in)).nextInt();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < t; i++) {
            String x = in.next();
            System.out.println(PalindromeByRemoving(x));
        }
    }

    static boolean isPalindrome(char[] a, int low, int high) {
        while (low < high) {
            if (a[low] != a[high]) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    static int PalindromeByRemoving(String s) {
        int low = 0;
        char a[] = s.toCharArray();
        int high = a.length - 1;
        while (low < high) {
            if (a[low] == a[high]) {
                low++;
                high--;
            } else {
                if (isPalindrome(a, low + 1, high)) {
                    return low;
                }
                if (isPalindrome(a, low, high - 1)) {
                    return high;
                }
            }
        }
        return -1;
    }
}
