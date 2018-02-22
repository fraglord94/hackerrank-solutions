package hackerrank.algorithms;

public class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int[] ans = new int[m * n];
        int row = 0;
        int col = 0;
        int d = 0;
        int[][] dir = new int[][]{{-1, 1}, {1, -1}};
        for (int i = 0; i < m * n; i++) {
            ans[i] = a[row][col];
            row = row + dir[d][0];
            col = col + dir[d][1];
            if (row < 0) {
                row = 0;
                d = 1 - d;
            }
            if (col < 0) {
                col = 0;
                d = 1 - d;
            }
            if (col >= n) {
                col = n - 1;
                row = row - 2;
                d = 1 - d;
            }
            if(row >= m){
                row = m - 1;
                col = col - 2;
                d = 1 - d;
            }
        }
        return ans;
    }
}
