package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MidtermDictionary {
    public static void printFrequency(int[] a) {
        Map<Integer, Integer> map = new TreeMap<>(Comparator.comparingInt((Integer o) -> o));
        Arrays.stream(a).forEachOrdered(x -> map.put(x, map.getOrDefault(map.get(x), 0) + 1));
        map.forEach((key, value) -> System.out.format("%d->%d", key, value));
    }
}