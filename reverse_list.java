package hackerrank.algorithms;

class reverse_list {
    Node Reverse(Node head) {
        Node next = null;
        Node current = head;
        Node prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        return prev;
    }
}