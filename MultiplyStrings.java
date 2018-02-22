package hackerrank.algorithms;

public class MultiplyStrings {
    public String multiply(String a, String b) {
        int ans[] = new int[a.length() + b.length()];
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                int x = (a.charAt(i) - '0') * (b.charAt(j) - '0');
                int pos1 = i + j;
                int pos2 = i + j + 1;
                int y = ans[pos2] + x;
                ans[pos1] += y / 10;
                ans[pos2] += y % 10;

            }
        }

        StringBuilder sb = new StringBuilder();
        for (int p : ans) if (!(sb.length() == 0 && p == 0)) sb.append(p);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
