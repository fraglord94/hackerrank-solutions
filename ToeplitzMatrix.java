package hackerrank.algorithms;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] a) {
        StringBuilder sb = new StringBuilder();
        int m = a.length;
        int n = a[0].length;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[i][j] != a[i + 1][j + 1])
                    return false;
            }
        }
        return true;
    }
}