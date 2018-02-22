package hackerrank.algorithms;

public class NDigitsWithSumS {
    public int solve(int n, int sum) {
        if(n < 0 || sum == 0)
            return 0;
        int dp[][] = new int[n + 1][sum  + 1];
        for(int i = 0; i <= sum; i++)
            dp[1][i] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= sum; j++){
                for(int digit = 0; digit <= 9; digit++){
                    if(j > digit){
                        dp[i][j] += dp[i-1][j-digit];
                    }
                }
            }
        }
        return dp[n][sum];
    }
}
