package hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class gemstone {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashSet<Character> hashSet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            hashSet.add(c);
        }
        HashSet<Character> temp = new HashSet<>();

        while (n > 0) {
            temp.clear();
            char[] current = in.next().toCharArray();
            for (int i = 0; i < current.length; i++) {
                temp.add(current[i]);
            }
            hashSet.retainAll(temp);
            temp.clear();
            n--;
        }
        System.out.println(temp.size());
    }
}
