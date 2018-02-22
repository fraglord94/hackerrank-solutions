package hackerrank.algorithms;

public class LongestSubstringwithAtLeastKRepeatingCharacters {
    public int longestSubstring(String s, int k) {
        return find(s.toCharArray(), 0, s.length(), k);
    }

    int find(char[] a, int start, int end, int k) {
        if (start > end)
            return 0;
        int[] countMap = new int[26];
        for (int i = start; i < end; i++) {
            countMap[a[i] - 'a']++;
        }
        for (int i = start; i <end; i++) {
            if (countMap[a[i] - 'a'] < k)
                return Math.max(find(a, start, i, k), find(a, i + 1, end, k));
        }
        return end - start;
    }
}
