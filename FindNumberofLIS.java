package hackerrank.algorithms;

import java.util.Arrays;

public class FindNumberofLIS {
    public int findNumberOfLIS(int[] a) {
        int len[] = new int[a.length];
        int count[] = new int[a.length];
        Arrays.fill(len, 1);
        Arrays.fill(count, 1);
        int max = 0;
        int ans = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < i; j ++){
                if(a[j] < a[i]){
                    if(len[i] < len[j] + 1) {
                        len[i] = len[j] + 1;
                        count[i] = count[j];
                    }
                    else if(len[i] == len[j] + 1){
                        count[j] += count[i];
                    }
                }
            }
            if(max == len[i])
                ans+= count[i];
            if(max < len[i]){
                max = len[i];
                ans = count[i];
            }
        }
        return ans;
    }
}
