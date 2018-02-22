package hackerrank.algorithms;

public class ConstructBinaryTreefromString {
    public TreeNode str2tree(String s) {
        int first = s.indexOf('(');
        int val;
        if(first == -1)
            val = Integer.parseInt(s.substring(0,1));
        else
            val = Integer.parseInt(s.substring(0,first));
        TreeNode node = new TreeNode(val);
        if(first == -1)
            return node;
        int start = first;
        int left = 0;
        for(int i = start; i < s.length(); i++){
            if(s.charAt(i) == '(')
                left++;
            else if(s.charAt(i) == ')')
                left--;
            if(left == 0 && start == first){
                node.left = str2tree(s.substring(start+1,i));
                start = i + 1;
            }
            if(left == 0){
                node.right = str2tree(s.substring(start+1,i));
            }

        }

        StringBuilder s1= new StringBuilder("sdsdf");
        s1.reverse();
        return  node;
    }
}
