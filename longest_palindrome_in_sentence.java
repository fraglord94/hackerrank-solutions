/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.util.Scanner;

/**
 *
 * @author aronee
 */
public class longest_palindrome_in_sentence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int j = 0; j < t; j++) {
            Scanner r = new Scanner(System.in);

            String x = r.nextLine();
            String[] sen = x.split("\\s+");
            for (int i = 0; i < sen.length; i++) {
                sen[i] = sen[i].replaceAll("[^\\w]", "");
            }

            int max = 0;
            String ans = new String();
            for (String string : sen) {
                StringBuilder temp = new StringBuilder(string);
                temp.reverse();
                if (string.equalsIgnoreCase(temp.toString())) {
                    if (string.length() > max) {
                        ans = string;
                    }
                }
            }
            System.out.println(ans.length());
        }

    }
}
