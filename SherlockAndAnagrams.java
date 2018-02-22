package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            Scanner scanner2 = new Scanner(System.in);
            String s = scanner2.nextLine();
            List<String> al = new ArrayList<>();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    al.add(s.substring(i, j));

                }
            }

            for (int i = 0; i < al.size(); i++) {
                String a = al.get(i);
                for (int j = i + 1; j < al.size(); j++) {
                    String b = al.get(j);
                    if (isAnagram(a, b)) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    static boolean isAnagram(String a, String b) {
        int map[] = new int[26];
        if (b.length() != a.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            map[a.charAt(i) - 'a']++;
        }
        for (int j = 0; j < b.length(); j++) {
            map[b.charAt(j) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (map[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
