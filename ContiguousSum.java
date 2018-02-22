package hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContiguousSum {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        List<Integer> arrayList = new ArrayList<>();
        while ((line = in.readLine()) != null) {
            arrayList = Arrays.asList(line.split(",")).stream().map(String::trim).map(Integer::parseInt).collect(Collectors.toList());
        }
        int globalMax = Integer.MIN_VALUE;
        int currentMax = 0;
        for(int i = 0; i < arrayList.size(); i++){
            currentMax = currentMax + arrayList.get(i);
            globalMax = Math.max(globalMax, currentMax);
            if(currentMax < 0)
                currentMax = 0;
        }
        System.out.println(globalMax);
    }
}
