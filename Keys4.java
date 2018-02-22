package hackerrank.algorithms;

public class Keys4 {
    public int maxA(int N) {
        int dp[] = new int[N+1];
        for(int i = 1; i <= 6; i++)
            dp[i] = i;
        for(int i = 7; i<= N; i++){
            dp[i] = i;
            for(int j = 1; j <= i-3; j++){
                dp[i] = Math.max(dp[i], (i-j-1) * dp[j]);
            }
        }
        return dp[N];

    }
}
