/*
 * 
 * 
 * 
 */
package hackerrank.algorithms;

/**
 *
 * @author aronee
 */
public class reverseWords {

    static void reverse() {
        String x  = " This is the new shit "; 
        
        String [] words = x.trim().split("\\s+"); 
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void main(String[] args) {
        reverse(); 
    }
}
