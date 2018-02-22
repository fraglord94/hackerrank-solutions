public class AddBinary {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            return addBinary(b, a);
        }
        while (a.length() != b.length()) {
            b = '0' + b;
        }
        int i = a.length() - 1;
        String sum = "";
        int carry = 0;
        while (i != -1) {
            int first = a.charAt(i) - '0';
            int second = b.charAt(i) - '0';
            int current = first ^ second ^ carry;
            sum = current + "" + sum;
            carry = (first & second) | (second & carry) | (first & carry);
            i--;
        }
        if (carry > 0)
            sum = carry + "" + sum;
        return sum;
    }
}
