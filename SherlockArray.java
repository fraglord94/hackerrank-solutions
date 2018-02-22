package hackerrank.algorithms;

import java.util.*;

public class SherlockArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int sum = 0;
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                sum = sum + a[i];
            }
            int sumL = 0;
            for (int i = 0; i < n; i++) {
                sum = sum - a[i];
                if (sum == sumL) {
                    flag = true;
                    break;
                }
                sumL = sumL + a[i];
            }
            System.out.println(flag == true ? "YES" : "NO");
            t--;
        }
    }
}
