import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int n = s.length();
        char[] c = s.toCharArray();
        while (i < n && j < n) {
            if (!set.contains(c[j])) {
                j++;
                max = Math.max(max, j - i);
            } else {
                set.remove(c[i]);
                i++;
            }
        }
        return max;
    }
}
