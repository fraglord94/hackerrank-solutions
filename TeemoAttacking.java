package hackerrank.algorithms;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] a, int d) {
        int ans = 0;
        int start = a[0];
        for(int i = 1; i < a.length; i++){
            int t = a[i];
            if(t > start + d)
                ans = ans + d;
            else
                ans = ans + (t-start);
            start = t;
        }
        return ans + d;
    }
}
