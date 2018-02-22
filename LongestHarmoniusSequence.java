import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniusSequence {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (map.containsKey(x))
                map.put(x, map.get(x) + 1);
            else
                map.put(x, 1);
        }

        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getKey();
            if (map.containsKey(x + 1))
                max = Math.max(max, map.get(x) + map.get(x + 1));
        }
        return max;

    }
}
