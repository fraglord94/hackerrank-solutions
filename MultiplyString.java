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
public class MultiplyString {

    public static void main(String[] args) {
        int x = 23;
        int y = 34;
        int carry = 0;
        while (y != 0) {
            carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.println(x);
        System.out.println(multiply(23,12));
        
    }
    
    static int  multiply(int x, int y){
        if(y == 0 || x == 0)
            return 0;
        else if(y > 0)
            return x + multiply(x,y-1);
        else //(y < 0)
            return -multiply(x,-y);        
    }
}
