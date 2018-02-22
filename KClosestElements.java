package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class KClosestElements {
    public List<Integer> findClosestElements(int[] a, int k, int x) {
        List<Integer> arr = Arrays.stream(a).boxed().collect(Collectors.toList());
        int index = Collections.binarySearch(arr, x);
        if (index < 0) {
            index = Math.abs(index) + 1;
        }
        int i = index - 1;
        int j = index;
        while (k > 0) {
            if (i < 0 || Math.abs(arr.get(j) - x) < Math.abs(arr.get(i) - x) && j < arr.size())
                j++;
            else
                i--;
        }
        return arr.subList(i + 1, j);
    }
}
