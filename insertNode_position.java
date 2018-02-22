package hackerrank.algorithms;

/*
 Insert Node at a given position in a linked list 
 head can be NULL 
 First element in the linked list is at position 0
 Node is defined as 
 */
class Node {

    int data;
    Node next;
    Node left;
    Node right;
}

class InsertNode_position {

    Node InsertNth(Node head, int data, int position) {
        Node temp = head;
        Node insertNode = new Node();
        insertNode.next = null;
        insertNode.data = data;

        if (position == 0) {
            insertNode.next = head;
            return insertNode;
        }

        if (head == null) {
            return insertNode;
        } else {
            while (--position > 0) {
                temp = temp.next;
            }
            insertNode.next = temp.next;
            temp.next = insertNode;
            return head;
        }
    }
}
