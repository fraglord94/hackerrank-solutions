package hackerrank.algorithms;

public class DecodeWays {
    public int numDecodings(String s) {
        if(s.length() == 0)
            return 0;
        int dp[] = new int[s.length() + 1];
        char[] c = s.toCharArray();
        dp[0] = 0;
        dp[1] = c[1] != '0' ? 1 : 0;
        for (int i = 2; i < dp.length; i++) {
            String oneDigit = s.substring(i - 1, i);
            String twoDisgit = s.substring(i - 2, i);
            if (Integer.parseInt(oneDigit) >= 1 && Integer.parseInt(oneDigit) <= 9)
                dp[i] = dp[i - 1];
            if (Integer.parseInt(twoDisgit) >= 10 && Integer.parseInt(twoDisgit) <= 26)
                dp[i] = dp[i - 2];

        }
        return dp[dp.length - 1];
    }
}
