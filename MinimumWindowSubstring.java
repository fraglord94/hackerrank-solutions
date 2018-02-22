import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int head = 0;
        int ans = Integer.MAX_VALUE;
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = map.size();
        while (j < s.length()) {
            char endChar = s.charAt(j);
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0)
                    count--;
            }
            j++;
            while (count == 0) {
                char startChar = s.charAt(i);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) > 0)
                        count++;
                }
                if (j - i < ans) {
                    ans = j - i;
                    head = i;
                }
                i++;

            }
        }
        if (ans == Integer.MAX_VALUE) {
            return "";
        } else
            return s.substring(head, head + ans);
    }
}
