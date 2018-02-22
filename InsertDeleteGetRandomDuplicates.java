package hackerrank.algorithms;

import java.util.*;

public class InsertDeleteGetRandomDuplicates {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>(Arrays.asList(2, 1, 3, 5));
        List<Integer> al2 = new ArrayList<>(Arrays.asList(1, 2));
        Collections.sort(al2, Comparator.comparingInt(al::indexOf));
        al2.forEach(System.out::print);

    }
}
