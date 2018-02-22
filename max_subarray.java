/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author aronee
 */
public class max_subarray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int m = 0; m < t; m++) {
            //problem
            int size = in.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = in.nextInt();
            }
            //continous
            int max_ending_here = 0, max_so_far = Integer.MIN_VALUE;
            for (int x : a) {
                max_ending_here = Math.max(x, max_ending_here + x);
                max_so_far = Math.max(max_so_far, max_ending_here);

            }
            System.out.println(max_so_far);
            Arrays.sort(a);
            int sum = 0;
            if (a[a.length - 1] < 0) {
                sum = a[a.length - 1];
            } else {
                for (int i : a) {
                    if (i > 0) {
                        sum += i;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
