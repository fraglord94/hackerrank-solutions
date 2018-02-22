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
public class edit_distance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        for (int i = 0; i < t; i++) {
            
        
        String a = new String(in.next());
        String b = new String(in.next());

        if (a.length() == 0 && b.length() == 0) {
            System.out.println(0);
        }
        System.out.println(dp_edit_distance(a, b, a.length(), b.length()));
        }
    }

    static int dp_edit_distance(String a, String b, int m, int n) {
        if (m == 0) {
            return b.length();
        }
        if (n == 0) {
            return a.length();
        }
        int[][] table = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            table[i][0] = i;
        }
        for (int i = 0; i < n + 1; i++) {
            table[0][i] = i;
        }
        table[0][0] = 0;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    table[i][j] = table[i - 1][j - 1];
                } else {
                    table[i][j] = 1 + Math.min(table[i - 1][j - 1], Math.min(table[i - 1][j], table[i][j - 1]));
                }
            }
        }
        return table[m][n];
    }

    static int edit_distance(String a, String b, int m, int n) {
        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }
        if (a.charAt(m - 1) == b.charAt(n - 1)) {
            return edit_distance(a, b, m - 1, n - 1);
        } else {
            return 1 + Math.min(edit_distance(a, b, m - 1, n - 1), Math.min(edit_distance(a, b, m - 1, n), edit_distance(a, b, m, n - 1)));
        }

    }

}
