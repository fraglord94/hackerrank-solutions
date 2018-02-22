package hackerrank.algorithms;

import java.util.HashSet;
import java.util.Set;

public class GenerateAllDecodeWays {

    public Set<String> decode(String string) {
        Set<String> result = new HashSet<String>();
        find("", string, result);
        return result;
    }

    void find(String current, String str, Set<String> ans) {
        if (str.length() == 0) {
            ans.add(current);
            return;
        }
        if (str.charAt(0) == '0')
            return;
        char c = (char) (Integer.valueOf(str.charAt(0)) - '1' + 'a');
        find(current + c, str.substring(1), ans);
        if (str.length() >= 2) {
            int c1 = Integer.valueOf(str.substring(0, 2));
            if (c1 <= 26) {
                char c2 = (char) (c1 - '1' + 'a');
                find(current + c2, str.substring(2), ans);
            }
        }
    }
}

