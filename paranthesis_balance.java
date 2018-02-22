package hackerrank.algorithms;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class paranthesis_balance {

    public static boolean isBalanced(String ex) {
        Stack<Character> stack = new Stack<>();
        stack.push(ex.charAt(0));
        for (int i = 1; i < ex.length(); i++) {
            char upper = ' ';
            if (!stack.isEmpty()) {
                upper = stack.peek();
            }
            stack.push(ex.charAt(i));
            if (!stack.isEmpty()) {
                if (upper == '{' && ex.charAt(i) == '}'
                        || upper == '(' && ex.charAt(i) == ')'
                        || upper == '[' && ex.charAt(i) == ']') {
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // int t = in.nextInt();
       // for (int a0 = 0; a0 < t; a0++) {
       //     String ex = in.next();
       String ex = "[";
            System.out.println((isBalanced(ex)) ? "YES" : "NO");
       // }
    }
}
