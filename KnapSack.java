package hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class KnapSack {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;

        String ans = "81 : (1,53.38,$45) (2,88.62,$98) (3,78.48,$3) (4,72.30,$76) (5,30.18,$9) (6,46.34,$48)";
        int maxWeight = -1;
        List<Double> weight = new ArrayList<>();
        List<Double> cost = new ArrayList<>();
        while ((line = in.readLine()) != null) {
            String[] split = line.split("\\s+");
            maxWeight = Integer.parseInt(split[0]);
            for (int i = 2; i < split.length; i++) {
                StringBuilder sb = new StringBuilder(split[i]);
                sb.deleteCharAt(0);
                sb.deleteCharAt(sb.length() - 1);
                String[] array = sb.toString().split("\\,");
                weight.add(Double.parseDouble(array[1]));
                cost.add(Double.parseDouble(array[2].substring(1)));
            }
            System.out.println(maxWeight);
            System.out.println(weight);
            System.out.println(cost);

            double[] price = new double[cost.size()];
            int index = 0;
            for (Double x : cost) {
                price[index++] = x;
            }

            double[] weights = new double[weight.size()];
            index = 0;
            for (double x : weight) {
                weights[index++] = x;
            }

        }
    }
}
