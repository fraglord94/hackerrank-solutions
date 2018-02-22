/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

/**
 *
 * @author aronee
 */
public class davis_stair_1_2 {

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib(n + 1));
        //System.out.println(fib_optimized(n + 1));

    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);

    }

    /* static int fib_optimized(int n) {
        if (n == 0) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;

        }
        return b;
    }*/
}
