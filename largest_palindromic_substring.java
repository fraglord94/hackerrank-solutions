/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.util.Scanner;

/**
 *
 * @author aronee 
*/
public class largest_palindromic_substring {

    public static void main(String[] args) {
        String s = (new Scanner(System.in)).next();
        int n = s.length();
       
        int max = 0;
        int start = 0;
        boolean table[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            table[i][i] = true;

        }
        max = 1;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                max = 2;
            }
        }
        for (int d = 3; d <= n; d++) {
            for (int i = 0; i < n - d + 1; i++) { //i goes from 0 through 2, 0 through 1, 0 through 0 
                int j = i + d - 1;
                if (table[i + 1][j - 1] && (s.charAt(i) == s.charAt(j))) {
                    table[i][j] = true;
                    if (d > max) {
                        start = i;
                        max = d;
                    }
                }

            }

        }
        System.out.println(s.substring(start,start+max));

    }
}
