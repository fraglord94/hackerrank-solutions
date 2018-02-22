package hackerrank.algorithms;

public class ValidWordAbbreviation {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        while(i < word.length() && j < abbr.length()) {
            if (word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
                continue;
            } else if (abbr.charAt(i) <= '0' || abbr.charAt(i) > '9')
                return false;
            int begin = j;
            while (abbr.charAt(j) > '0' && abbr.charAt(j) <= 9 && j < abbr.length()) {
                j++;
            }
            int number = Integer.valueOf(abbr.substring(begin, j));
            i = i + number;
        }
        return i == word.length() && j == abbr.length();
    }
}
