package hackerrank.algorithms;

/**
 *
 * @author aronee
 */
public class nth_ugly_number {

    static int getNthUglyNumber(int n) {
        int a[] = new int[n];
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int next_2 = 2;
        int next_3 = 3;
        int next_5 = 5;
        int next_ugly_number = 1;
        a[0] = 1;
        for (int i = 1; i < n; i++) {
            next_ugly_number = Math.min(Math.min(next_2, next_3), next_5);
            a[i] = next_ugly_number;
            if(next_2 == next_ugly_number){
                i2++;
                next_2 = a[i2] * 2; 
            }
            if(next_3 == next_ugly_number){
                i3++;
                next_3 = a[i3]*3; 
            }
            if(next_5 == next_ugly_number){
                i5++; 
                next_5 = a[i5]*5;
            }
        }
        return a[n-1];
    }

    public static void main(String[] args) {
        System.out.println(getNthUglyNumber(150));
    }
}
