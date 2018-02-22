package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StringPermutation {

    static int generateNextLexicographical(String s) {

        char w[] = s.toCharArray();
        int index = 0;
        for (int i = w.length - 1; i >= 0; i--) {
            if (w[i - 1] < w[i]) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        StringBuilder ans = new StringBuilder();
        char candidate = w[index - 1];
        char[] substring = s.substring(index).toCharArray();
        Arrays.sort(substring);
        w[index - 1] = substring[0];
        substring[0] = candidate;

        for (int i = 0; i < index; i++) {
            ans.append(w[i]);
        }

        ans.append(String.valueOf(substring));
        System.out.println(ans);

        return 1;

    }

    public static void main(String[] args) {
        boolean stop = false;
        String x = "abcdefg";
        StringBuilder sb = new StringBuilder(x);
        System.out.println(x.equals(sb.reverse().toString()));
        System.out.println();

    }
}
