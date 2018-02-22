/*
 * 
 * 
 * 
 */
package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aronee
 */
public class fizzbuzz {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        int n = 15;
        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                al.add("FizzBuzz");
            } else if (i % 3 == 0) {
                al.add("Fizz");
            } else if (i % 5 == 0) {
                al.add("bBuzz");
            } else {

                al.add(String.valueOf(i));
            }
        }
        for (String string : al) {
            System.out.println(string);
        }
    }
}
