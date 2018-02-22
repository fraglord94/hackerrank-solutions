package hackerrank.algorithms;

public class ZigZagPattern {
    public String convert(String s, int n) {

        StringBuilder[] strings = new StringBuilder[n];
        boolean down = true;
        int row = 0;
        for (char c : s.toCharArray()) {
            strings[row].append(c);
            if (row == 0)
                down = true;
            else if (row == n - 1)
                down = false;
            if (down == true)
                row++;
            else if (down == false)
                row--;
        }
        String ans = "";
        for (StringBuilder s1 : strings) {
            ans = ans + s1.toString();
        }
        return ans;
    }
}
