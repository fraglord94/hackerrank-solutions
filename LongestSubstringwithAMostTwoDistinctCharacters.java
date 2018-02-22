import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithAMostTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int count = 0;
        int ans = 0;
        while (end < s.length()) {
            char endChar = s.charAt(end);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);
            if (map.get(endChar) == 1)
                count++;
            end++;
            while (count > 2) {
                char starChar = s.charAt(start);
                map.put(starChar, map.get(starChar) - 1);
                if (map.get(starChar) == 0)
                    count--;
                start++;
            }
            ans = Math.max(ans, end - start);
        }
        return ans;
    }
}
