//package hackerrank.algorithms;
//
//import java.util.Arrays;
//import java.util.Deque;
//
//public class SerializeAndDeserialize {
//
//    public String serialize(TreeNode root) {
//        StringBuilder sb = new StringBuilder();
//        build(root, sb);
//        return sb.toString();
//    }
//
//
//    private void build(TreeNode node, StringBuilder sb) {
//        if (node == null) {
//            sb.append("null");
//            sb.append(",");
//        }
//        sb.append(node.val + "");
//        sb.append(",");
//        build(node.left, sb);
//        build(node.right, sb);
//    }
//
//    public TreeNode deserialize(String data) {
//        Deque<String> al = new LinkedList<>();
//        al.addAll(Arrays.asList(data.split(",")));
//        return debuild(al);
//    }
//
//    private TreeNode debuild(Deque<String> dq) {
//        String x = dq.poll();
//        if (x.equals("null"))
//            return null;
//        TreeNode node = new TreeNode(Integer.parseInt(x));
//        node.left = debuild(dq);
//        node.right = debuild(dq);
//        return node;
//    }
//
//}
