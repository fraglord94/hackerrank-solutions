package hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class RepeatedPatternArray {
    public static void main(String[] args) throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;

        Set<String> nonRepeatingSeq = new TreeSet<>();
        TreeSet<String> repeatingSeq = new TreeSet<>(Collections.reverseOrder());
        while ((line = in.readLine()) != null) {
            String[] array = line.split("\\s+");
            StringBuilder test = new StringBuilder();
            for (String x : array)
                test.append(x);
            for (int step = test.length(); step >= 1; step--) {
                for (int i = 0; (i < test.length() && (i + step) <= test.length()); i++) {
                    String sub = test.substring(i, i + step);
                    if (!nonRepeatingSeq.add(sub)) {
                        repeatingSeq.add(sub);
                    }
                }
            }
            String ans = repeatingSeq.first();
            ans = ans.substring(0, ans.length() / 2);
            ans = ans.replace("", " ").trim();
            System.out.println(ans);
        }
    }
}
