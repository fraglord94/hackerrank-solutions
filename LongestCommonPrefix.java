package hackerrank.algorithms;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] a) {
        if (a.length == 0)
            return "";
        Arrays.sort(a);
        System.out.println(Arrays.deepToString(a));
        char[] first = a[0].toCharArray();
        char[] last = a[a.length - 1].toCharArray();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < first.length; i++) {
            if (i < last.length && first[i] == last[i])
                ans.append(first[i]);
            else
                break;
        }
        return ans.toString();
    }
}
