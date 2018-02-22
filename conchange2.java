/*
 * 
 * 
 * 
 */
package hackerrank.algorithms;

/**
 *
 * @author aronee
 */
public class conchange2 {

    public static void main(String[] args) {
        int coins[] = {1, 2, 3};
        System.out.println(count(coins, coins.length, 5));
    }

    static long count(int coins[], int m, int amount) {
        if (amount == 0 && m == 0) {
            return 1;
        }
        if (amount > 0 && m == 0) {
            return 0;
        }
        int n = amount;
        long table[][] = new long[n + 1][m];
        for (int i = 0; i < m; i++) {
            table[0][i] = 1;
        }
        for (int price = 1; price < n + 1; price++) {
            for (int j = 0; j < m; j++) {
                //taking the coin j and seeing if number of ways of amount - j is >= 0
                long x = (price - coins[j]) >= 0 ? table[price - coins[j]][j] : 0;
                //not taking the coin then I only need to see if the  
                long y = (j > 0) ? table[price][j - 1] : 0;
                table[price][j] = x + y;

            }

        }
        return table[n - 1][m - 1];
    }

}
