package hackerrank.algorithms;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String x = "sdfsdfdsfdsfsdertegsdfbsgjioeragierwgevamvaehnwrignrqecmewnginwejvnjtnhnrjvnjwrihjreiojyhrwkogvdjuibtrh";
        char a[] = x.toCharArray();
        StringBuilder sb = new StringBuilder();
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                sb.append(a[i]);
                while (a[i] == a[i + 1]) {
                    i++;
                }
            } else {
                sb.append(a[i]);
            }
        }
        System.out.println(sb);
    }

}
