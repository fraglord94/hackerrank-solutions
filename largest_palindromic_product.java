///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package hackerrank.algorithms;
//
//import java.math.BigInteger;
//
//public class largest_palindromic_product {
//
//    public static void main(String[] args) {
//        int n = 5;
//
//        int start = 0;
//        int end = 0;
//        for (int i = 1; i <= n; i++) {
//            end = end * 10;
//            end = end + 9;
//        }
//        BigInteger max = BigInteger.ZERO;
//        start = 1 + end / 10;
//        System.out.println(end);
//        System.out.println(start);
//        for (int i = end; i >= start; i--) {
//            for (int j = i; j >= start; j--) {
//                long temp = i * j;
//
//                if (temp > max && isPalindrome(temp)) {
//                    max = temp;
//                }
//            }
//
//        }
//        System.out.println(max);
//
//    }
//
//    static boolean isPalindrome(BigInteger x) {
//        int rev = 0;
//        while (x > rev) {
//            rev = 10 * rev + x % 10;
//            x /= 10;
//        }
//        return x == rev;
//    }
//}
