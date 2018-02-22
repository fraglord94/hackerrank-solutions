package hackerrank.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FPTree {
    private FPNode root;

    FPTree() {
        this.root = new FPNode();
    }

    public static void main(String[] args) {
        FPTree fpTree = new FPTree();
        fpTree.add(Arrays.asList(1, 2, 3, 4));
    }

    void add(List<Integer> transaction) {
        FPNode current = root;
        for (int i = 0; i < transaction.size(); i++) {
            int item = transaction.get(i);
            FPNode node = current.map.get(item);
            if (node == null) {
                node = new FPNode();
                current.map.put(item, node);
            }
            current = node;
        }
    }

    class FPNode {
        private Map<Integer, FPNode> map;
        private int val;

        public FPNode() {
            map = new HashMap<>();
        }

        public FPNode(Map<Integer, FPNode> map) {
            this.map = map;
        }
    }

}
