/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.util.Scanner;

public class lcs {

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

    static int lcs3(String a1, String b1, String c1) {
        int m = a1.length();
        int n = b1.length();
        int o = c1.length();
        char[] a = a1.toCharArray();
        char[] b = b1.toCharArray();
        char c[] = c1.toCharArray();
        int arr[][][] = new int[m + 1][n + 1][o + 1];

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                for (int k = 1; k < o + 1; k++) {

                    if (i == 0 || j == 0 || k == 0) {
                        arr[i][j][k] = 0;
                    } else if (a[i - 1] == b[j - 1] && b[j - 1] == c[k - 1]) {
                        arr[i][j][k] = 1 + arr[i - 1][j - 1][k - 1];
                    } else {
                        arr[i][j][k] = Math.max(arr[i][j][k - 1], Math.max(arr[i - 1][j][k], arr[i][j - 1][k]));
                    }

                }
            }
        }

        return arr[m][n][o];
    }

    static void print_lcs(char[][] temp, char[] a, int i, int j) {
        if (i == -1 || j == -1) {
            return;
        }
        if (temp[i][j] == 'd') {
            print_lcs(temp, a, i - 1, j - 1);
            System.out.println(a[i]);
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
        //int m = in.nextInt();
        // int n = in.nextInt();
        //String x = new String(in.next());
        //String y = new String(in.next());
        //System.out.println("the length from the recursion is this " + lcs_recursive(x.toCharArray(), y.toCharArray(), x.length(), y.length()));
        // lcs_top_down(x.toCharArray(), y.toCharArray());

        System.out.println(lcs3("AGGT12", "12TXAYB", "12XBA"));

    }

}
