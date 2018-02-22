/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

/**
 *
 * @author Aronee Dasgupta
 */
public class lis_binary_search {

    static int binarySearch(int tailtable[], int l, int r, int key) {
        while (l < r) {
            int m = (l + r) / 2;
            if (key > tailtable[m]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return r;
    }

    static int lis(int[] a) {
        int len = 1;
        int n = a.length;
        int[] tailtable = new int[n];
        if (n == 1) {
            return 1;
        }
        tailtable[0] = a[0];
        for (int i = 1; i < n; i++) {
            int key = a[i];
            if (key > tailtable[len - 1]) {
                tailtable[len++] = key;
            } else if (key < tailtable[0]) {
                tailtable[0] = key;
            } else {
                int r = binarySearch(tailtable, 0, len - 1, key);
                tailtable[r] = key;
            }
        }
        return len;

    }

    public static void main(String[] args) {
        int A[] = { 2, 5, 3, 7, 11, 8, 10, 13, 6 };
        System.out.println(lis(A));

    }
}
