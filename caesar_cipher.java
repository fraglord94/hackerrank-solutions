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
public class caesar_cipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.append((char) (97 + (97 -  + 100) % 26));
            } else if (Character.isUpperCase(c)) {
                sb.append((char) (65 + (65 - c + 100) % 26));
            } else {
                sb.append(c);
            }

        }
        System.out.println(sb);
    }
}
