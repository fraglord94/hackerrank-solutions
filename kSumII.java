package hackerrank.algorithms;

import java.util.*;

public class kSumII {
    Set<List<Integer>> ans;

    public List<List<Integer>> kSumII(int[] a, int k, int target) {
        ans = new HashSet<>();
        Arrays.sort(a);
        dfs(a, k, target, new ArrayList<>(), 0);
        return new ArrayList<>(ans);
    }

    void dfs(int[] a, int k, int target, List<Integer> temp, int start) {
        if(k == temp.size()){
            if(target == 0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        for (int i = start; i < a.length; i++) {
            if (a[i] > target)
                continue;
            temp.add(a[i]);
            dfs(a, k, target - a[i], temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
