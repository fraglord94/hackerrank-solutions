package hackerrank.algorithms;

import java.util.*;

class CombinationSum {
    static void find(List<List<Integer>> ans, List<Integer> temp, int start, int sum, int[] a) {
        if (sum == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        } else if (sum < 0)
            return;
        for (int i = start; i < a.length; i++) {
            temp.add(a[i]);
            find(ans, temp, i, sum - a[i], a);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        find(ans, new ArrayList<>(), 0, target, candidates);
        Set<List<Integer>> set = new HashSet<>();
        set.addAll(ans);
        ans.clear();
        return new ArrayList<>(set);
    }
}