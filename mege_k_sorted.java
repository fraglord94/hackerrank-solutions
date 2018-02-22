package hackerrank.algorithms;

public class mege_k_sorted {

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node merge_k(Node[] list) {
        int last = list.length;
        while (last != 0) {
            int i = 0;
            int j = last;
            while (i > j) {
                list[i] = merge(list[i], list[j]);
                if (i > j) {
                    last = j;
                }
            }
        }
        return list[0];
    }

    Node merge(Node headA, Node headB) {
        if (headA == null) {
            return headB;
        }
        if (headB == null) {
            return headA;
        }
        Node result = null;
        if (headA.data <= headB.data) {
            result = headA;
            result.next = merge(headA.next, headB);
        } else {
            result = headB;
            result.next = merge(headA, headB.next);
        }
        return result;
    }
}
