package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class MaximumWordLengthProduct {
    public int maxProduct(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.length() + o2.length();
            }
        });
        for (int i = 0; i < words.length; i++) {
            label:
            for (int j = i+1; j < words.length; j++) {
                String first = words[i];
                String second = words[j];
                Set<Character> set = new HashSet<>();
                for (char c : first.toCharArray())
                    set.add(c);
                for (char c : second.toCharArray()) {
                    if (set.contains(c))
                        continue label;
                }
                return first.length() * second.length();
            }
        }
        return 0;
    }
}
