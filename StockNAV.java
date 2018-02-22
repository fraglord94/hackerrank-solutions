package hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.*;

public class StockNAV {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        Map<String, Stock> portStockMap = new HashMap<>();

        Map<String, Stock> benchStockMap = new HashMap<>();

        /*
        String is split and two lists corresponding to portfolio Stocks and bench Stocks are created with Stock objects.
         */
        while ((line = in.readLine()) != null) {
            String[] portfolios = line.split("\\|");
            portStockMap = parser(portStockMap, portfolios[0]);
            benchStockMap = parser(benchStockMap, portfolios[1]);
        }

        Double portNAV = calculateNAV(portStockMap);
        Double benchNAV = calculateNAV(benchStockMap);

        /*
        The TreeSet orders the tuples alphabetically.
         */
        Set<Tuple> tupleTreeSet = new TreeSet<>(Comparator.comparing(o -> o.stockName));

        calculateNAVDifference(tupleTreeSet, portStockMap, benchStockMap, portNAV, benchNAV);
        calculateBenchNAVPercentage(tupleTreeSet, benchStockMap, benchNAV);

        /*
        Parse
         */
        StringBuilder result = new StringBuilder();
        tupleTreeSet.forEach(tuple -> {
            result.append(tuple.stockName);
            result.append(":");
            result.append(tuple.differenceNAV);
            result.append(",");
        });

        System.out.println(result.substring(0, result.length() - 1));
    }

    /**
     * Parses the input to portfolio maps.
     *
     * @param stockMap
     * @param stockDetails
     * @return
     */
    private static Map<String, Stock> parser(Map<String, Stock> stockMap, String stockDetails) {
        stockDetails = stockDetails.substring(stockDetails.indexOf(':') + 1);
        String[] portStocksList = stockDetails.split(";");
        for (String s : portStocksList) {
            String[] split = s.split(",");
            Stock stock = new Stock(split[0], Integer.parseInt(split[1]), Double.parseDouble(split[2]));
            stockMap.put(split[0], stock);
        }
        return stockMap;
    }

    /**
     * Utility function to calculate the NAV in a portfolio.
     *
     * @param stockMap
     * @return
     */
    private static Double calculateNAV(Map<String, Stock> stockMap) {
        Double nav = 0.0;
        for (Map.Entry<String, Stock> entry : stockMap.entrySet()) {
            nav += entry.getValue().quantity * entry.getValue().price;
        }
        return nav;
    }

    /**
     * Function to calculate the BenchNAV percentage in BENCH for stocks not present in PORT.
     *
     * @param tupleTreeSet
     * @param benchStockMap
     * @param benchNAV
     */
    private static void calculateBenchNAVPercentage(Set<Tuple> tupleTreeSet, Map<String, Stock> benchStockMap, Double benchNAV) {
        benchStockMap.entrySet().stream().map(Map.Entry::getKey).forEachOrdered(stockName -> {
            Double benchStockPrice = benchStockMap.get(stockName).price;
            Integer benchStockQuantity = benchStockMap.get(stockName).quantity;
            Double benchStockNAV = (benchStockPrice * benchStockQuantity * 100) / benchNAV;
            if (benchStockNAV == 0.0) {
                tupleTreeSet.add((new Tuple(stockName, "-0.00")));

            } else {
                DecimalFormat decimalFormat = new DecimalFormat("##.00");
                tupleTreeSet.add((new Tuple(stockName, decimalFormat.format(-benchStockNAV))));
            }
        });
    }

    /**
     * Calculates the NAV difference between stocks in PORT and BENCH and populates the TreeSet.
     *
     * @param tupleTreeSet
     * @param portStockMap
     * @param benchStockMap
     * @param portNAV
     * @param benchNAV
     */
    private static void calculateNAVDifference(Set<Tuple> tupleTreeSet, Map<String, Stock> portStockMap, Map<String,
            Stock> benchStockMap, Double portNAV, Double benchNAV) {
        portStockMap.forEach((stockName, value) -> {
            Double portStockPrice = value.price;
            Integer portStockQuantity = value.quantity;

            Double benchStockPrice = 0.0;
            Integer benchStockQuantity = 0;

            if (benchStockMap.containsKey(stockName)) {
                benchStockPrice = benchStockMap.get(stockName).price;
                benchStockQuantity = benchStockMap.get(stockName).quantity;
                benchStockMap.remove(stockName);
            }

            Double portStockNAV = (portStockPrice * portStockQuantity * 100) / portNAV;
            Double benchStockNAV = (benchStockPrice * benchStockQuantity * 100) / benchNAV;

            if ((portStockNAV - benchStockNAV) == 0)
                tupleTreeSet.add(new Tuple(stockName, "-0.00"));

            else {
                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                tupleTreeSet.add(new Tuple(stockName, decimalFormat.format(portStockNAV - benchStockNAV)));
            }

        });
    }

    /**
     * Class representing a stock entity.
     */
    private static class Stock {
        private String stockName;
        private Integer quantity;
        private Double price;

        private Stock(String stockName, Integer quantity, Double price) {
            this.stockName = stockName;
            this.quantity = quantity;
            this.price = price;
        }

    }

    /**
     * Class representing a stock name and the NAV difference.
     */
    private static class Tuple {
        private String stockName;
        private String differenceNAV;

        private Tuple(String stockName, String differenceNAV) {
            this.stockName = stockName;
            this.differenceNAV = differenceNAV;
        }

    }
}

