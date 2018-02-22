package hackerrank.algorithms;

import hackerrank.algorithms.partition_merge_k_sorted.ListNode;

public class SplitList {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            len++;
        }

        int min = len / k;
        int extra = len % k;
        ListNode[] array = new ListNode[k];
        current = head;
        ListNode prev = null;
        for (int i = 0; i < k; i++) {
            array[i] = current;
            int plusOne = extra > 0 ? 1 : 0;
            for (int x = 0; x < min + plusOne; x++) {
                prev = current;
                current = current.next;
            }
            extra = extra - 1;
            if (prev != null)
                prev.next = null;

        }
        return array;
    }
}
