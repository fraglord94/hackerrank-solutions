/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
 * @author Aronee Dasgupta
 */
public class maximum_element {

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> max = new Stack<>();
        //max.push(-1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = br.read();
        for (int i = 0; i < n; i++) {
            int choice = br.read();
            int x = br.read();
            switch (choice) {
                case 1:
                    stack.push(x);
                    if (x > max.peek()) {
                        max.push(x);
                    } else {
                        max.push(max.peek());
                    }
                    break; 
                case 2:
                    stack.pop();
                    max.pop(); 
                    break;
                case 3:
                    System.out.println(max.peek());
                    break;
            }
        }
    }
}
