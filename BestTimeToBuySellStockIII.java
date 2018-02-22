package hackerrank.algorithms;

import java.util.Arrays;

public class BestTimeToBuySellStockIII {
    public int maxProfit(int[] prices) {
        int k = 2;
        int[][] a = new int[k + 1][prices.length];
        for (int j = 0; j < prices.length + 1; j++) {
            a[0][j] = 0;
        }
        for (int j = 0; j < k + 1; j++) {
            a[j][0] = 0;
        }
        for (int days = 1; days < k + 1; days++) {
            for (int i = 1; i < prices.length; i++) {
                int max = Integer.MIN_VALUE;
                for (int j = 0; j < i; j++)
                    max = Math.max(max, prices[i] - prices[j] - a[days - 1][j]);
                a[days][i] = Math.max(a[days][i - 1], max);
            }
        }

        Arrays.stream(a).forEach(System.out::println);
        return a[k][a.length - 1];


    }
}
