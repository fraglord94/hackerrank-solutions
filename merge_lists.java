package hackerrank.algorithms;

/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
public class merge_lists {
    Node MergeLists(Node headA, Node headB) {
        Node result = null;

        if (headA == null)
            return headB;
        else if (headB == null)
            return headA;

        if (headA.data <= headB.data) {
            result = headA;
            result.next = MergeLists(headA.next, headB);
        } else {
            result = headB;
            result.next = MergeLists(headA, headB.next);
        }

        return result;
    }
}