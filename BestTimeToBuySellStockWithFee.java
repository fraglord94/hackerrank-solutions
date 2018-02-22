package hackerrank.algorithms;

public class BestTimeToBuySellStockWithFee {
    public int maxProfit(int[] prices, int fee) {
        long tik0 = 0;
        long tik1 = Integer.MIN_VALUE;
        for (int price : prices) {
            long tik0_old = tik0;
            tik0 = Math.max(tik0, tik1 + price - fee);
            tik1 = Math.max(tik1, tik0_old - price);

        }
        return (int) tik0;
    }
}
