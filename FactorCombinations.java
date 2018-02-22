package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class FactorCombinations {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(new ArrayList<>(), ans, 2, 1, n);
        if (ans.size() == 1)
            return new ArrayList<>();
        ans.remove(ans.size() - 1);
        return ans;
    }

    private void dfs(List<Integer> temp, List<List<Integer>> ans, int start, int mul, int n) {
        if (n == mul) {
            if (temp.size() >= 1)
                ans.add(new ArrayList<>(temp));
            return;
        }
        if(mul > n && temp.size() != 0)
            return;
        for (int i = start; i <= n; i++) {
            if (n % i == 0) {
                temp.add(i);
                mul = mul * i;
                dfs(temp, ans, i, mul, n);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
