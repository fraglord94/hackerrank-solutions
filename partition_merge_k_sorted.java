package hackerrank.algorithms;

public class partition_merge_k_sorted {

    public static class ListNode {

        ListNode next;
        int val;

        public ListNode(ListNode next, int val) {
            this.next = next;
            this.val = val;
        }

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        return partition(lists, 0, lists.length - 1);
    }

    static ListNode partition(ListNode[] lists, int i, int j) {
        if (i == j) {
            return lists[i];
        }
        if (i < j) {
            int mid = (i + j) / 2;
            return merge(partition(lists, i, mid), partition(lists, mid + 1, j));
        } else {
            return null;
        }

    }

    static ListNode merge(ListNode headA, ListNode headB) {
        if (headA == null) {
            return headB;
        }
        if (headB == null) {
            return headA;
        }
        ListNode result = null;
        if (headA.val <= headB.val) {
            result = headA;
            result.next = merge(headA.next, headB);
        } else {
            result = headB;
            result.next = merge(headA, headB.next);
        }
        return result;
    }
}
