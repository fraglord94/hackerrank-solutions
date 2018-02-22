/**
 * Created by Aronee Dasgupta on 9/17/2017.
 */
public class CoinChange {
    static int count(int S[], int m, int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        if (m <= 0 && n >= 1)
            return 0;
        return count(S, m - 1, n) + count(S, m, n - S[m - 1]);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ans = count(arr, arr.length, 10);
        System.out.println(ans);
    }
}
