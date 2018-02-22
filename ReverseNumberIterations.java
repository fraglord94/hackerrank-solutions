package hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReverseNumberIterations {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        StringBuilder sb;
        while ((line = in.readLine()) != null) {
            sb = new StringBuilder(line);
            int count = 0;
            while (!sb.toString().equals(sb.reverse().toString())){
                count++;
                sb = new StringBuilder(Long.toString(Long.valueOf(sb.toString()) + Long.valueOf(sb.reverse().toString())));
            }
            System.out.println(count + " " + sb.toString());
        }
    }

}