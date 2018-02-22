import java.util.*;

public class PalindromePairs {
    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        return s.equals(sb.toString());
    }

    public List<List<Integer>> palindromePairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            word = word.reverse();
            if (map.containsKey(word.toString())) {
                int j = map.get(word.toString());
                if (i == j)
                    continue;
                ans.add(Arrays.asList(i, j));
            }

        }

        if (map.containsKey("")) {
            int blankIdx = map.get("");
            for (int i = 0; i < words.length; i++) {
                if (isPalindrome(words[i])) {
                    if (i == blankIdx) continue;
                    ans.add(Arrays.asList(blankIdx, i));
                    ans.add(Arrays.asList(i, blankIdx));
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            String current = words[i];
            for (int j = 1; j <= current.length(); j++) {
                String frontCut = current.substring(0, j);
                if (isPalindrome(frontCut)) {
                    String reverse = (new StringBuilder(frontCut)).reverse().toString();
                    if (map.containsKey(reverse)) {
                        int k = map.get(reverse);
                        if (k == i)
                            continue;
                        ans.add(Arrays.asList(k, j));
                    }
                }
                String backCut = current.substring(j);
                if (isPalindrome(backCut)) {
                    String reverse = (new StringBuilder(backCut)).reverse().toString();
                    if (map.containsKey(reverse)) {
                        int k = map.get(reverse);
                        if (k == i)
                            continue;
                        ans.add(Arrays.asList(k, j));
                    }

                }
            }

        }

        return ans;

    }
}
