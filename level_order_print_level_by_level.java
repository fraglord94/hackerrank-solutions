/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithms;

import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author Aronee Dasgupta
 */
public class level_order_print_level_by_level {

    public class Node {

        Node left;
        Node right;
        int data;
    }

    public void levelByLevel(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        q1.add(root);
        while (!q1.isEmpty() || !q2.isEmpty()) {
            while (!q1.isEmpty()) {
                Node temp = q1.poll();
                if (temp.left != null) {
                    q2.add(temp.left);
                }
                if (temp.right != null) {
                    q2.add(temp.right);
                }
                System.out.print(temp.data + " ");
            }
            System.out.println("");
            while (!q2.isEmpty()) {
                Node temp = q2.poll();
                if (temp.left != null) {
                    q1.add(temp.left);
                }
                if (temp.right != null) {
                    q1.add(temp.right);
                }
                System.out.print(temp.data + " ");
            }
            System.out.println("");
        }
    }
}
