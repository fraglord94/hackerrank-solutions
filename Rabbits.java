package hackerrank.algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class Rabbits {
    public int numRabbits(int[] a) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.stream(a).boxed().collect(Collectors.toList()));
        Map<Integer, Integer> map = new HashMap<>(set.size());
        for(int x : a){
            map.put(x, 1);
        }
        for(int x : a){

        }
        int x = 0;
        for (int i : map.values())
            x += i;
        return x;
    }
}
