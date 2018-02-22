/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aronee Dasgupta
 */
public class beautiful_binary {

    public static void main(String[] args) {
        String string = "0101010";
        Pattern pattern = Pattern.compile("010");
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
        countPattern("abcdeabdesdhfjdshkjfhdsfabdesdfsfhgabdefghfdbjkfdnbabdeosfjgisiogiofdabcdesojfiojsdiojfabcdejgiogjiodjgabcdeodfngdfgnjdngabcdedjgdgndng", "abcde");
    }

    static void countPattern(String string, String pattern) {
        Pattern x = Pattern.compile("abcde");
        Matcher m = x.matcher(string);
        while (m.find()) {
            System.out.println(m.start() + " " + m.end());
        }
    }

}
