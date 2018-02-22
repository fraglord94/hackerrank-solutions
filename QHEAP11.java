package hackerrank.algorithms;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class QHEAP11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(n, (Integer x, Integer y) -> {
            if (x > y) {
                return -1;
            } else if (x == y) {
                return 0;
            } else {
                return 1;
            }
        });

        while (n > 0) {
            int type = in.nextInt();
            switch (type) {
                case 1:
                    maxHeap.offer(in.nextInt());
                case 2:
                    maxHeap.remove(in.nextInt());
                case 3:
                    System.out.println(maxHeap.peek());
            }
            n--;
        }

    }
}
