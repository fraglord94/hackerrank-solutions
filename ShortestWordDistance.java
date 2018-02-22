import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShortestWordDistance {
    Map<String, List<Integer>> map;

    public ShortestWordDistance(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String x = words[i];
            if (map.containsKey(x))
                map.get(x).add(i);
            else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(x, list);
            }
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> l1 = map.get(word1);
        List<Integer> l2 = map.get(word2);
        int i1 = 0;
        int i2 = 0;
        int ans = Integer.MAX_VALUE;
        while (i1 < l1.size() && i2 < l2.size()) {
            int index1 = l1.get(i1);
            int index2 = l2.get(i2);
            if (index1 < index2) {
                ans = Math.min(ans, index2 - index1);
                i1++;
            } else {
                ans = Math.min(ans, index1 - index2);
                i2++;
            }
        }
        return ans;
    }
}
