public class TargetSumK {
    static int countDivisibleSubseq( String str, int n)
    {
        int len = str.length();
        int dp[][] = new int[len][n];
        dp[0][(str.charAt(0)-'0')%n]++;
        for (int i=1; i<len; i++)
        {
            dp[i][(str.charAt(i)-'0')%n]++;
            for (int j=0; j<n; j++)
            {
                dp[i][j] += dp[i-1][j];
                dp[i][(j*10 + (str.charAt(i)-'0'))%n] += dp[i-1][j];
            }
        }

        return dp[len-1][0];
    }

    public static void main(String[] args) {
        int []a = new int[]{1,2,3,4};
        int n = 4;
        StringBuilder sb = new StringBuilder();
        for(int x : a){
            sb.append(String.valueOf(x));
        }
        int ans = countDivisibleSubseq(sb.toString(), n);
        System.out.println(ans);

    }
}

