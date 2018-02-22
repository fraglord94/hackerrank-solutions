package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        find(ans, new ArrayList<>(), 0, nums);
        return ans;

    }

    private void find(List<List<Integer>> ans, List<Integer> temp, int start, int[] a) {
        ans.add(new ArrayList<>(temp));
        for (int i = 0; i < a.length; i++) {
            if (a[i] == temp.get(temp.size() - 1))
                continue;
            temp.add(a[i]);
            find(ans, temp, i + 1, a);
            temp.remove(temp.size() - 1);
        }
    }
}
