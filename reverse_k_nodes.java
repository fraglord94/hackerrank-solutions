/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

public class reverse_k_nodes {

    class Node {

        Node next;
        int data;
    }

    static Node reverse(Node head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        Node dummy; 
        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null) {
            dummy = reverse(next, k);
        }
        return prev;
    }
}
