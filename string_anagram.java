package hackerrank.algorithms;


import java.util.Scanner;

public class string_anagram {

    public static int numberNeeded(String first, String second) {

        char x_1[] = first.toCharArray();
        char y_1[] = second.toCharArray();
        int len[] = new int[26];
        for (char m : x_1) {
            len[m - 'a']++;
        }
        for (char m : y_1) {
            len[m - 'a']--;
        }
        int count = 0;
        for (int m : len) {
            count = count + Math.abs(m);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
