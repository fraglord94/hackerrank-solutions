package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class sum2 {

    static List<List<Integer>> sum_2(int[] a, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(sum - a[i])) {
                List<Integer> temp = new ArrayList<>();
                temp.add(a[i]);
                temp.add(sum - a[i]);
                al.add(temp);
                map.remove(a[i]);
                map.remove(sum - a[i]);
            } else {
                map.put(a[i], i);
            }
        }
        return al;

    }

    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 10, 8, 8, 8, 16, 0, 16,0};
        for (List<Integer> x : sum_2(A, 16)) {
            System.out.println(x.get(0) + " " + x.get(1));

        }

    }
}
