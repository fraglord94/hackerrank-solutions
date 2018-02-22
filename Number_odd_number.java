package hackerrank.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Number_odd_number {

    public static void main(String[] args) {
        int a[] = new int[15];
        for (int i = 0; i < 15; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        Set<Integer> map = new HashSet<>();
        for (int i = 0; i < 15; i++) {
            int ele = a[i];
            if (map.contains(ele)) {
                map.remove(ele);
            } else {
                map.add(ele);
            }
        }
        System.out.println("rr");

        Iterator<Integer> iter = map.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
