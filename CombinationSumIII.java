package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    private static void find(List<List<Integer>> res, List<Integer> temp, int start, int sum, int k) {
        if (sum == 0 && temp.size() >= k) {
            res.add(new ArrayList<>(temp));
        }

        for (int i = start; i <= 9; i++) {
            temp.add(i);
            find(res, temp, i + 1, sum - i, k);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        find(ans, new ArrayList<>(), 1, n, k);
        return ans;
    }
}
