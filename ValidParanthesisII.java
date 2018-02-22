package hackerrank.algorithms;

public class ValidParanthesisII {
    public boolean checkValidString(String s) {
        return true;
    }

    private boolean findRight(String s) {
        int open = 0;
        int close = 0;
        int star = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (c[i] == '(')
                open++;
            else if (c[i] == ')')
                close++;
            else if (c[i] == '*')
                star++;
            if (close - open > star)
                return false;
        }
        if (close == open || close <= open + star)
            return true;
        return false;

    }

    private boolean findLeft(String s) {
        int open = 0;
        int close = 0;
        int star = 0;
        char[] c = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (c[i] == '(')
                open++;
            else if (c[i] == ')')
                close++;
            else if (c[i] == '*')
                star++;
            if (close - open > star)
                return false;
        }
        if (close == open || close <= open + star)
            return true;
        return false;

    }
}
