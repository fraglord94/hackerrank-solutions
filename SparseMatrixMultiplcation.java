package hackerrank.algorithms;

import java.util.PriorityQueue;
import java.util.Queue;

public class SparseMatrixMultiplcation {
    public int[][] multiply(int[][] a, int[][] b) {
        int c[][] = new int[a.length][b[0].length];
        int m = a.length;
        int n = a[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != 0) {
                    for (int k = 0; k < m; k++) {
                        if (b[j][k] != 0) {
                            c[i][k] += a[i][j] * b[j][k];
                        }
                    }
                }
            }
        }
        return c;
    }
}
