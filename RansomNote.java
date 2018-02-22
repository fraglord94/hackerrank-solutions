package hackerrank.algorithms;

import java.util.*;
public class RansomNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    boolean isValid = false;
    public RansomNote(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();
        for (String x : magazine.split(" ")) {
            Integer i = magazineMap.get(x);
            if (i == null) {
                magazineMap.put(x, i);
            } else {
                magazineMap.put(x, i + 1);
            }
        }

        for (String word : note.split(" ")) {
            Integer x = magazineMap.get(word);
            if (x == 0) {
                isValid = false;
            }
       }
    }
    public boolean solve() {
        return isValid;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        boolean answer = s.solve();

    }
}
