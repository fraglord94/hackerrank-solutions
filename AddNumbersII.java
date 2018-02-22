package hackerrank.algorithms;

import hackerrank.algorithms.partition_merge_k_sorted.ListNode;

import java.util.Stack;

public class AddNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        ListNode current = l1;
        while (current != null) {
            stack1.push(current);
            current = current.next;
        }
        current = l2;
        while (current != null) {
            stack2.push(current);
            current = current.next;
        }
        int sum = 0;
        ListNode dummy = new ListNode(-1);
        while (stack1.size() != 0 || stack2.size() != 0) {
            if (stack1.size() != 0)
                sum = sum + stack1.pop().val;
            if (stack2.size() != 0)
                sum = sum + stack2.pop().val;
            dummy.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = dummy;
            dummy = head;
            sum = sum / 10;
        }
        return dummy.val == 0 ? dummy.next : dummy;
    }
}
