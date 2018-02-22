/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.util.InputMismatchException;

/**
 *
 * @author aronee
 */
public class reverse_integer {

    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));

    }

    static int reverse(int x) {
        long ans = 0;

        boolean flag = false;
        if (x < 0) {
            flag = true;
            x = 0 - x;
        }
        while (x > 0) {
            ans = ans * 10 + x % 10;
            x = x / 10;
            if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
                return 0;
            }

        }
        if (flag) {
            ans = 0 - ans;
        }
        return (int)ans;
    }
}
