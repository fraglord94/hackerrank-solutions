package hackerrank.algorithms;


public class anagrams_pairs_in_words {

    public static void main(String[] args) {
        String x = "geeksforgeeks";
        String y = " ".trim();

        int[] store = new int[26];
        for (int i = 0; i < x.length(); i++) {
            store[x.charAt(i) - 97]++;
        }
        for (int i = 0; i < y.length(); i++) {
            store[y.charAt(i) - 97]--;
        }
        boolean sign = true;
        for (int i = 0; i < store.length; i++) {
            int flag = store[i];
            if (flag != 0) {
                sign = false;
                break;
            }
        }

        System.out.print(sign ? "yes" : "no");

    }

}
