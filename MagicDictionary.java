import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MagicDictionary {
    private Map<String, Set<int[]>> map;

    public MagicDictionary() {
        map = new HashMap<>();

    }

    public void buildDict(String[] dict) {
        for (String s : dict) {
            for (int i = 0; i < s.length(); i++) {
                String x = s.substring(0, i) + s.substring(i + 1);
                int[] a = new int[2];
                a[0] = i;
                a[1] = s.charAt(i);
                Set<int[]> set = map.getOrDefault(x, new HashSet<>());
                set.add(a);
                map.put(x, set);
            }
        }
    }

    public boolean search(String word) {
        for (int i = 0; i < word.length(); i++) {
            String key = word.substring(0, i) + word.substring(i + 1);
            if (map.containsKey(key)) {
                Set<int[]> a = map.get(key);
                for (int[] pair : a) {
                    if (pair[0] == i && pair[1] != word.charAt(i))
                        return true;
                }
            }

        }
        return false;
    }
}
