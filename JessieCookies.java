package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JessieCookies {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(n, (Integer x, Integer y) -> {
            if (x > y) {
                return +1;
            } else if (x.equals(y)) {
                return 0;
            } else {
                return -1;
            }
        });
        for (int i = 0; i < n; i++) {
            pq.add(in.nextInt());
        }
        int count = 0;
        while (pq.peek() <= k && pq.size() >= 2) {
            pq.add(pq.poll() * 1 + pq.poll() * 2);
            count++;
        }
        if (pq.size() <= 1 || pq.peek() < k) {
            count = -1;
        }
        System.out.println(count);
    }

}
