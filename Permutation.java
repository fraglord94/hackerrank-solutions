package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation {
    public List<List<Integer>> permute(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(a, 0, a.length - 1, ans);
        return ans;
    }

    void dfs(int[] array, int left, int right, List<List<Integer>> ans) {
        if (left == right) {
            ans.add(Arrays.stream(array).boxed().collect(Collectors.toList()));
        } else {
            for (int i = left; i <= right; i++) {
                swap(array, left, i);
                dfs(array, i + 1, right, ans);
                swap(array, i, left);
            }
        }
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
