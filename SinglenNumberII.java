package hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aronee Dasgupta on 9/18/2017.
 */
public class SinglenNumberII {
    public static void main(String[] args) {

        int a[] = new int[4];
    }

    public int singleNumber(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : a) {
            if (map.containsKey(x))
                map.put(x, map.get(x) + 1);
            else
                map.put(x, 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("the key is " + entry.getKey() + "the value is " + entry.getValue());
        }
        return 1;
    }
}
