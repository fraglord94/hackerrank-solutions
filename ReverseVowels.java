import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ans = reverseVowels(s);
        System.out.println(ans);
    }

    private static String reverseVowels(String s){
        if(s == null || s.length()==0) return "Incorrect Input";
        String vowels = "aeiouAEIOU";
        char[] a = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            while(start < end && !vowels.contains(a[start] + ""))
                start++;
            while(start < end && !vowels.contains(a[end] + ""))
                end--;
            char x = a[start];
            a[start] = a[end];
            a[end] = x;
            start++;
            end--;
        }
        return new String(a);
    }
}
