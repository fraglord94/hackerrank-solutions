package hackerrank.algorithms;
public class davis_stair_generalized {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(dp(n + 1, m));
    }
    static int stair(int n, int m) {
        int res = 0;
        if (n <= 1) {
            return n;
        }
        for (int i = 1; i <= m && i <= n; i++) {
            res += stair(n - i, m);
        }
        return res;
    }
    static int dp(int n, int m) {
        int[] res = new int[n];
        if (n <= 1) {
            return n;
        }
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i < n; i++) {
            res[i] = 0;
            for (int j = 1; j <= m && j <= i; j++) {
                res[i] += res[i - j];
            }
        }
        return res[n-1];
    }
}