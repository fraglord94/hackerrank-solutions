package hackerrank.algorithms;


public class addLinkedList {

    static Node head1, head2;

    private void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node addTwoLists(Node headA, Node headB) {
        Node res = null;
        int carry = 0;
        int sum = 0;
        Node prev = null;
        Node temp = null;
        while (headA != null || headB != null) {
            int a = headA != null ? headA.data : 0;
            int b = headB != null ? headB.data : 0;
            sum = carry + a + b;
            carry = sum / 10;
            sum = sum % 10;
            temp = new Node(sum);
            if (res == null) {
                res = temp;
            } else {
                prev.next = temp;
            }
            if (headA != null) {
                headA = headA.next;
            }
            if (headB != null) {
                headB = headB.next;
            }
            prev = temp;

        }

        if (carry > 0) {
            temp.next = new Node(carry);
        }
        return res;
    }

    public static void main(String[] args) {
        addLinkedList list = new addLinkedList();

        // creating first list
        list.head1 = new Node(7);
        list.head1.next = new Node(5);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(4);
        list.head1.next.next.next.next = new Node(6);
        System.out.print("First List is ");
        list.printList(head1);

        // creating seconnd list
        list.head2 = new Node(8);
        list.head2.next = new Node(4);
        System.out.print("Second List is ");
        list.printList(head2);

        // add the two lists and see the result
        Node rs = list.addTwoLists(head1, head2);
        System.out.print("Resultant List is ");
        list.printList(rs);
    }

}
