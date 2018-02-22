package hackerrank.algorithms;

public class AddStrings {

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("12");
        StringBuilder b = new StringBuilder("123213");

        int n1 = a.length();
        int n2 = b.length();
        if (n1 - n2 > 0) {
            //pad integer 2
            int d = n1 - n2;
            while (d > 0) {
                b.insert(0, '0');
                d--;
            }
        }

        if (n1 - n2 < 0) {
            //pad integer 2
            int d = n2 - n1;
            while (d > 0) {
                a.insert(0, '0');
                d--;
            }
        }
        int i = a.length() - 1;
        int n = a.length();
        int carry = 0;
        char ans[] = new char[n + 1];
        while (i >= 0) {
            int x = a.charAt(i) - '0';
            int y = b.charAt(i) - '0';
            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            //System.out.println(sum + " " + carry);
            ans[i + 1] = (char) (sum + '0');
            i--;
        }
        

        ans[0] = (char) (carry + '0');
        String ans1 = String.valueOf(ans);
        if (ans1.charAt(0) == '0') {
            ans1 = ans1.substring(1);

        }
        System.out.println(ans1);
    }

}
