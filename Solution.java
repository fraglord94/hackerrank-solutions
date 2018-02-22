import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static void getLexicographicalGreaterString(String s) {
        char w[] = s.toCharArray();
        int index = 0;
        for (int i = w.length - 1; i >= 1; i--) {
            if (w[i - 1] < w[i]) {
                index = i;
                break;
            }

        }
        char[] substring = s.substring(index).toCharArray();
        char[] substring1 = substring;

        char candidate = w[index - 1];
        Arrays.sort(substring);
        for (int i = 0; i < substring.length; i++) {
            if (substring[i] > candidate) {
                w[index - 1] = substring[i];
                substring[i] = candidate;
                break;
            }
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < index; i++) {
            result.append(w[i]);
        }
        Arrays.sort(substring);
        for (char c : substring1) {
            result.append(c);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            String ans = s.next();
            StringBuilder sb = new StringBuilder();
            char a[] = ans.toCharArray();
            Arrays.sort(a);
            for (char c : a) {
                sb.append(c);
            }
            boolean flag = sb.reverse().toString().equals(ans);
            // System.out.println(ans + " " + sb.reverse().toString());
            if (flag == true) {
                System.out.println("no answer");
            } else {
                getLexicographicalGreaterString(ans);
            }
            t--;
        }

    }

}
