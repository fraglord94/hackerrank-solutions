import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IncreasingSubsequences {
    private static void backtrack(Set<List<Integer>> res, List<Integer> temp, int start, int[] a, int k) {
        if (temp.size() >= k) {
            res.add(new ArrayList<>(temp));
        }
        for (int i = start; i < a.length; i++) {
            if (temp.get(temp.size() - 1) <= a[i] || temp.size() == 0) {
                temp.add(a[i]);
                backtrack(res, temp, start + 1, a, k);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(ans, temp, 0, nums, 2);
        return new ArrayList<>(ans);
    }
}
