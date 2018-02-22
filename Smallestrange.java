package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Smallestrange {
    public static int[] smallestRange(List<List<Integer>> nums) {
        int[] ptr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            ptr[i] = 0;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIdx = -1;
        int minRange = Integer.MAX_VALUE;
        int ans[] = new int[2];
        int finish = 0;
        int k = nums.size();
        int n = nums.get(0).size();

        while (true) {
            for (int i = 0; i < k; i++) {
                if (ptr[i] < n && nums.get(i).get(ptr[i]) < min) {
                    minIdx++;
                    min = nums.get(i).get(ptr[i]);
                }
                if (ptr[i] < n && nums.get(i).get(ptr[i]) > max) {
                    max = nums.get(i).get(ptr[i]);
                }
                if (minIdx == n) {
                    finish = 1;
                    break;
                }

            }

            ptr[minIdx]++;


            if (finish == 1) {
                break;
            }
            if (max - min < minRange) {
                ans[1] = max;
                ans[0] = min;
            }

        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> temp = new ArrayList<>();
        int a[][] = new int[][]{{4, 10, 15, 24}, {0, 9, 12, 20}, {5, 18, 22, 30}};

    }

}
