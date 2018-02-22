package hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoanAmount {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        List<Double> arrayList = new ArrayList<>();
        while ((line = in.readLine()) != null) {
            arrayList = Arrays.asList(line.split("~"))
                    .stream()
                    .map(String::trim)
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());
        }

        Double presentValue = arrayList.get(0) - arrayList.get(3);
        Double time = arrayList.get(1);
        Double rate = arrayList.get(2);

        Double ratePerPeriod = rate / (12 * 100);
        Double numberOfPeriods = time * 12;

        Double monthlyPayment = (ratePerPeriod * presentValue) / (1 - Math.pow((1 + ratePerPeriod), -numberOfPeriods));
        Double totalPayment = monthlyPayment * 12 - presentValue;

        StringBuilder result = new StringBuilder();
        result.append("$").append(Math.round(monthlyPayment)).append("~").append("$").append(Math.round(totalPayment));
        System.out.println(result);

    }
}
