package hackerrank.algorithms;

public class MergeStrings {
    /**
     * Function to merge an input array of string into a single string which contains all the characters
     * from each input string in alphabetical order.
     *
     * @param strings: An array of string as the input.
     * @return Returns a string which is the sorted sequence of all the lowercase characters appearing in the
     * strings in the input array.
     */
    static String MergeStrings(String[] strings) {
        //An array to count the frequency of each character between 'a' and 'z' in the string .
        int[] characterMap = new int[26];
        for (String s : strings) {
            char[] array = s.toCharArray();
            for (char c : array) {
                if (c >= 'a' && c <= 'z')
                    characterMap[c - 'a']++;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (characterMap[i] != 0) {
                int count = characterMap[i];
                while (count-- > 0) {
                    result.append((char) (i + 'a'));
                }
            }
        }
        return result.toString();
    }
}
