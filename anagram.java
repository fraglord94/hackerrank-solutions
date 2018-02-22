package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            String s = in.next();
            int n = s.length();
            String s1 = s.substring(0, n / 2);
            String s2 = s.substring(n / 2);
            if (s1.length() != s2.length()) {
                System.out.println(-1);
                continue;
            }
            int count = 0;
            
            System.out.println(count);
            t--;
        }
    }

}
