package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class SingleNumberIII {
    public List<Integer> singleNumberIII(int[] a) {
        int xor = 0;
        for(int x : a)
            xor = xor ^ x;
        int set = xor & ~(xor-1);
        int m = 0;
        int n = 0;
        for(int x : a){
            if((x & set) == 0){
                m = m ^ x;
            }
            else
                n = n ^ x;
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(m);
        ans.add(n);
        return ans;
    }
}
