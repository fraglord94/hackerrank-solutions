package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int[] a = new int[26];
        for (char c : licensePlate.toCharArray()) {
            if (Character.isLowerCase(c)) {
                a[c - 'a']++;
            }
            if (Character.isUpperCase(c)) {
                a[c - 'A']++;
            }
        }
        for (String word : words) {
            int[] b = new int[26];
            for (char c : word.toCharArray())
                b[c - 'a']++;
            if (checkSame(a, b))
                return word;
        }
        return " ";
    }

    boolean checkSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] > b[i])
                return false;
        }
        return true;
    }
}
