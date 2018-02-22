/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.util.Scanner;

public class lps_lcs {

    static int c[][];
    static char temp[][];

    static int lcs_top_down(char a[], char b[]) {
        int m = a.length;
        int n = b.length;
        c = new int[m + 1][n + 1];
        temp = new char[m][n];
        for (int i = 0; i < m + 1; i++) {
            c[i][0] = 0;
        }
        for (int j = 0; j < n + 1; j++) {
            c[0][j] = 0;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (a[i - 1] == b[j - 1]) {
                    c[i][j] = 1 + c[i - 1][j - 1];
                    temp[i - 1][j - 1] = 'd';
                } else if (c[i - 1][j] >= c[i][j - 1]) {
                    c[i][j] = c[i - 1][j];
                    temp[i - 1][j - 1] = 't';
                } else {
                    c[i][j] = c[i][j - 1];
                    temp[i - 1][j - 1] = 'l';
                }

            }
        }
        print_lcs(temp, a, m - 1, n - 1);
        /*for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println("");
        }*/
        return c[m][n];

    }

    static void print_lcs(char[][] temp, char[] a, int i, int j) {
        if (i == -1 || j == -1) {
            return;
        }
        if (temp[i][j] == 'd') {
            print_lcs(temp, a, i - 1, j - 1);
            System.out.print(a[i]);
        }
        if (temp[i][j] == 't') {
            print_lcs(temp, a, i - 1, j);
        }
        if (temp[i][j] == 'l') {
            print_lcs(temp, a, i, j - 1);
        }
    }

    static int lcs_recursive(char[] a, char[] b, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (a[m - 1] == b[n - 1]) {
            return 1 + lcs_recursive(a, b, m - 1, n - 1);
        } else {
            return Math.max(lcs_recursive(a, b, m - 1, n), lcs_recursive(a, b, m, n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //StringBuilder sb = new StringBuilder(in.next()); 
        StringBuilder sb  = new StringBuilder("BBABCBCAB");
            
        lcs_top_down(sb.toString().toCharArray(),sb.reverse().toString().toCharArray() );
    }

}
