package hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)";

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        String line;

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Set<String> set = new HashSet<>();
        set.add("com");
        set.add("org");
        set.add("net");
        while ((line = in.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            String[] split = line.split("\\.");
            String last = split[split.length - 1];

            if (matcher.matches() && set.contains(last))
                System.out.println("TRUE");
            else
                System.out.println("FALSE");
        }
    }
}