/**
 * Created by Aronee Dasgupta on 9/20/2017.
 */
public class Niti {
    static int kraken(int m, int n) {
        if(m == 0 && n == 0 || m < 0 || n < 0)
            return 0;
        if(m == 0 || n == 0)
            return 1;
        int a[][] = new int[m][n];

        for (int i = 0; i < m; i++)
            a[i][0] = 1;
        for (int i = 0; i < n; i++)
            a[0][i] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                a[i][j] = a[i - 1][j] + a[i][j - 1] + a[i - 1][j - 1];
            }
        }
        return a[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(kraken(3,3)); ;
    }



}
