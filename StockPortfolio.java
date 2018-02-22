package hackerrank.algorithms;

import java.util.*;

public class StockPortfolio {
    private Map<String, Stock> map;
    private Queue<Integer> maxHeap;

    StockPortfolio() {
        map = new HashMap<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    void insertStock(Stock stock) {
        if (!map.containsKey(stock.stockName)) {
            map.put(stock.stockName, stock);
            maxHeap.offer(stock.stockValue);
        }
    }

    boolean update(Stock stock) {
        if (map.containsKey(stock.stockName)) {
            map.put(stock.stockName, stock);
            if (stock.stockValue > maxHeap.peek()) {
                maxHeap.offer(stock.stockValue);
            }
        }
        return false;
    }

    int[] getTopFiveStocks() {
        int[] topFiveStocks = new int[5];
        int index = 0;
        int k = 5;
        while (k > 0) {
            topFiveStocks[index++] = maxHeap.poll();
            k--;
        }
        return topFiveStocks;
    }

    class Stock {
        String stockName;
        int stockValue;
    }
}
