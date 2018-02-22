package hackerrank.algorithms;

import java.util.HashMap;

public class reverseStringIII {

    public static void main(String[] args) {
        String x = new String("Let's take LeetCode contest");
        HashMap<String, Integer> map = new HashMap<>();
        String[] temp = x.split("\\s+");
        for (String string : temp) {
            System.out.println(string);
        }
        StringBuffer ans = new StringBuffer();
        for (String string : temp) {
            ans = ans.append(new StringBuffer(string).reverse());
            //ans.append(" ");
        }
        String ans1 = new String(ans); 
        String trim = ans1.trim(); 
        System.out.println(trim);

    }

}
