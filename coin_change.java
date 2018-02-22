package hackerrank.algorithms;
public class coin_change {
    public static void main(String[] args) {
        int[] S = {1, 2, 3};
        System.out.println(count(S, S.length, 5));
        System.out.println(dp(S, S.length, 5));
    }
   static int count(int[] S, int m, int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (m == 0 && n > 0) return 0;
        return count(S, m, n - S[m - 1]) + count(S, m - 1, n);
    }
   static int dp(int []coin, int m, int n){
       int [][]table = new int[n+1][m]; //have 0 as the final amount and m is the no
       //coins in the bag
       
       for (int i = 0; i < m; i++) 
           table[0][i] = 1; //if the amount is zero then I can reach by not taking
           //any coins which will be 1; 
        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < m; j++) {
                //to see if I can take the mth coinI can do two things 
                //take the jth coin and check if the amount doesn't become negative 
                //if it does then I can't take the jth coin
                
                //I can choose not to take the jth solution and my solution will be
                // same as taking only j - 1 coins but i have to be sure that j -1 doesn't
                //fall below zero 
                int x = (i - coin[j]) >= 0 ? table[i-coin[j]][j] : 0;
                int y = (j - 1 ) >= 0 ? table[i][j-1] : 0;
                table[i][j] = x + y;
            }
       }
        return table[n][m-1];
   }
}
