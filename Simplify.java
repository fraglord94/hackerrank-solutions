package hackerrank.algorithms;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Simplify {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] dirs = path.split("/");
        Set<String> set = new HashSet<>();
        set.add(".");
        set.add("..");
        set.add("/");
        for (String dir : dirs) {
            if (dir.equals("..") && !stack.isEmpty())
                stack.pop();
            else if (!set.contains(dir))
                stack.push(dir);
        }
        String ans = "";
        for (String s : stack) {
            ans = ans + "/" + s;
        }
        if (ans.length() == 0)
            return "/";
        else
            return ans;
    }
}
