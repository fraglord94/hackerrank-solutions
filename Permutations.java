import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static void find(List<List<Integer>> result, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length)
            result.add(temp);
        else {
            for (int i = 0; i < nums.length; i++) {
                temp.add(nums[i]);
                find(result, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        System.out.println("ho");
        List<List<Integer>> ans = new ArrayList<>();
        find(ans, new ArrayList<>(), nums);
        for (List<Integer> l : ans) {
            for (Integer i : l) {
                System.out.print(i + " ");
            }
        }
        return ans;
    }
}
