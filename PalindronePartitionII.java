package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PalindronePartitionII {
    public List<String> generatePalindromes(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int odd = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue() % 2 != 0)
                odd++;
        }
        if (odd > 1)
            return new ArrayList<>();
        String mid = "";

        List<Character> charList = new ArrayList<>();
        for (Map.Entry<Character, Integer> entrySet : map.entrySet()) {
            char c = entrySet.getKey();
            int count = entrySet.getValue();
            if (count % 2 != 0)
                mid = String.valueOf(c);
            count = count / 2;
            for (int i = 0; i < count; i++) {
                charList.add(c);
            }
        }
        List<String> ans = new ArrayList<>();
        dfs(charList, mid, new StringBuilder(), ans, new boolean[charList.size()]);
        return ans;
    }

    void dfs(List<Character> list, String mid, StringBuilder stringBuilder, List<String> result, boolean[] used) {
        if (stringBuilder.length() == list.size()) {
            result = new ArrayList<>();
            result.add(stringBuilder.toString() + mid + stringBuilder.reverse().toString());
            stringBuilder.reverse();
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (i > 0 && list.get(i) == list.get(i - 1) && !used[i - 1])
                continue;
            if (!used[i - 1]) {
                used[i] = true;
                stringBuilder.append(list.get(i));
                dfs(list, mid, stringBuilder, result, used);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                used[i] = false;
            }
        }
    }
}


