/*
 * 
 * 
 * 
 */
package hackerrank.algorithms;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author aronee
 */
public class InfoxToPostfix {

    static int Prec(char ch) {
        switch (ch) {
            case '+':
                return 1;
            case '-':
                return 1;
            case '/':
                return 2;
            case '*':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static Stack<Character> stack = new Stack<Character>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            Scanner x = new Scanner(System.in);
            String s = x.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char current = s.charAt(i);
                //number push it in
                if (Character.isAlphabetic(current)) {
                    sb.append(current);
                } //if the charcater is a '('
                else if (current == '(') {
                    stack.push('(');
                } else if (current == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        sb.append(stack.pop());
                    }
                    stack.pop();
                } //it is an operatoris 
                else {
                    //if the operator has greater precedence than what is on tht stack then put it on. Or else
                    while (!stack.isEmpty() && Prec(current) <= Prec(stack.peek())) {
                        sb.append(stack.pop());
                    }
                    sb.append(current);
                }
            }
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            System.out.println(sb);
            t--;
        }
    }
}
