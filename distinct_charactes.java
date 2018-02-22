package hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class distinct_charactes {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        char[] s = "Programming".toCharArray();
        for (Character arg : s) {
            if (map.containsKey(arg)) {
                map.put(arg, map.get(arg) + 1);
            } else {
                map.put(arg, 1);
            }
        }
        Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character,Integer> entry : entrySet) {
            if(entry.getValue() > 0)
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
        }
    }
}
