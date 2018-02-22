/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.util.Stack;

/**
 *
 * @author Aronee Dasgupta
 */
public class nge {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        int a[] = {2, 5, 1, 4, 6, 8, 95, 3, 7, 3, 61, 24, 5, 17, 9, 37, 49};
        s.push(a[0]);
        int element, next;
        for (int i = 1; i < a.length; i++) {
            next = a[i];
            if (!s.empty()) {
                element = s.pop();
                while (element < next) {
                    System.out.println(element + " NGE is " + next);
                    if (s.isEmpty()) break;
                    element = s.pop();
                }
                if (element > next) s.push(element);
                s.push(next);
            }
        }
        while (!s.empty()) {
            System.out.println(s.pop() + " the NGE is " + -1);
        }
    }
}
