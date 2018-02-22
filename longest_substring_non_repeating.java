/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author arone008
 */
public class longest_substring_non_repeating {

    public static void main(String[] args) {
        String x = "pwwkew";
        int n = x.length();
        int i = 0, j = 0;
        int max, ans = 0;
        Set<Character> set = new HashSet<Character>();
        while (i < n && j < n) {
            if (!set.contains(x.charAt(j))) {
                set.add(x.charAt(j++));
                ans = j - i;
            } else {
                set.remove(x.charAt(i++));
            }
        }
        System.out.println(ans);
    }
}
