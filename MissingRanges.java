package hackerrank.algorithms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingRanges {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = lower; i <= upper; i++) {
            set.add(i);
        }
        for (int x : nums) {
            if (set.contains(x))
                set.remove(x);
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        return null;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        findMissingRanges(a, lower, upper);
    }


}