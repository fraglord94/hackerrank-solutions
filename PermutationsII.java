import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationsII {
    static void find(List<List<Integer>> ans, List<Integer> temp, int[] a, boolean[] used) {
        if (temp.size() == a.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (used[i] == true)
                continue;
            if (i > 0 && a[i] == a[i - 1] && !used[i - 1])
                continue;
            used[i] = true;
            temp.add(a[i]);
            find(ans, temp, a, used);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        find(ans, new ArrayList<>(), nums, used);
        Set<List<Integer>> set = new HashSet<>();
        set.addAll(ans);
        ans.clear();
        ans.addAll(set);
        return ans;
    }
}
