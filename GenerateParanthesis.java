package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        util(ans, "",n,n);
        return ans;

    }

    public void util(List<String> ans, String s, int left, int right){
        if(left > right)
            return;
        if(left == 0 && right == 0){
            ans.add(s);
            return;
        }
        if(left > 0)
            util(ans, s + "(", left-1, right);
        if(right > 0)
            util(ans, s + ")", left, right-1);
    }

}
