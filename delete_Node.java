package hackerrank.algorithms;

/*
 Delete Node at a given position in a linked list 
 head pointer input could be NULL as well for empty list
 Node is defined as
*/


public class delete_Node {

    Node Delete(Node head, int position) {
        if (head == null) {
            return head;
        }
        if (position == 0) {
            return head.next;
        }
        Node temp = head;
        while (--position > 0) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

}
