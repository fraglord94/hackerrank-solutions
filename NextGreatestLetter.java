package hackerrank.algorithms;

import java.util.Arrays;

public class NextGreatestLetter {
    public char nextGreatestLetter(char[] a, char x) {
        int low = 0;
        int high = a.length;
        while(low < high){
            int mid = (low + high)/ 2;
            if(a[mid] <= x)
                low = mid+1;
            else
                high = mid;
        }
        return a[low/a.length];
    }
}
