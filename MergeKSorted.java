import java.math.BigInteger;
import java.util.PriorityQueue;

public class MergeKSorted {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1.val < o2.val)
                return -1;
            else if (o1.val == o2.val)
                return 0;
            else
                return 1;
        });
        ListNode dummy = new ListNode(-1);
        for (ListNode head : lists){
            pq.offer(head);
        }
        ListNode temp = dummy;
        while(pq.size() != 0){
            temp.next = pq.poll();
            temp = temp.next;
            if(temp.next != null)
                pq.offer(temp.next);
        }
        return dummy.next;





    }

    public ListNode plusOne(ListNode head) {
        if(head == null)
            return new ListNode(1);
        StringBuilder ans = new StringBuilder();
        ListNode current = head;
        while(current != null){
            ans.append(current.val+"");
            current = current.next;
        }
        Long big = Long.parseLong(ans.toString());
        big = big + 1;
        String result = String.valueOf(big);

        ListNode node = null;
        ListNode head1 = null;
        ListNode last = null;

        for(int i = 0; i < result.length(); i++){
            if(node == null){
                node = new ListNode(result.charAt(i));
                if(head1 == null)
                    head1 = node;
                if(last != null)
                    last.next = node;

            }
            last = node;
            node = node.next;
        }
        return head1;

    }
}
