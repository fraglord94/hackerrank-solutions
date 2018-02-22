package hackerrank.algorithms;

import java.util.Arrays;

public class remove_duplicate {
    public static void main(String[] args) {
        String s = "asfsdbsdfg";
        char []a = s.toCharArray(); 
        Arrays.sort(a);
        StringBuilder sb = new StringBuilder(); 
        for (int i = 1; i < a.length; i++) {
            if(a[i] != a[i-1])
                sb.append(a[i]); 
        }
        System.out.println(sb);
                
    }
}
