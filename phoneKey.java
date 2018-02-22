package hackerrank.algorithms;

import java.util.Scanner;

public class phoneKey {

    static char[][] table = new char[10][];
    static String result = new String();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        result = "";
        table[0] = new char[]{'0', '0', '0', '0'};

        table[1] = new char[]{'0', '0', '0', '0'};
        table[2] = new char[]{'a', 'b', 'c', '0'};
        table[3] = new char[]{'d', 'e', 'f', '0'};
        table[4] = new char[]{'g', 'h', 'i', '0'};
        table[5] = new char[]{'j', 'k', 'l', '0'};
        table[6] = new char[]{'m', 'n', 'o', '0'};
        table[7] = new char[]{'p', 'q', 'r', 's'};
        table[8] = new char[]{'t', 'u', 'v', '0'};
        table[9] = new char[]{'w', 'x', 'y', 'z'};

        String s = new String("2");
        int num[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            num[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        phone_number(num, 0, s.length());

    }

    static void phone_number(int num[], int count, int length) {
        if (count == length) {
            System.out.println(result + " " + result.length());
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (table[num[count]][i] != '0') {
                result = result + String.valueOf(table[num[count]][i]);

                phone_number(num, count + 1, length);
                if (result.length() > 0) {
                    result = result.substring(0, result.length() - 1);
                }

            }
        }
    }

}
