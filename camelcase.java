/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

/**
 *
 * @author Aronee Dasgupta
 */
import java.util.*;
public class camelcase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toUpperCase(s.charAt(i)) == s.charAt(i)) {
                max++;
            }
        }
        System.out.println(max);
    }
}
