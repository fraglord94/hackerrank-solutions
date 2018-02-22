import javax.swing.tree.TreeNode;

/**
 * Created by Aronee Dasgupta on 9/15/2017.
 */
public class MatrixLinkedList {
    public static void main(String[] args) {
        MatrixLinkedList m = new MatrixLinkedList();
        Node head = m.build(0,0, 3,4);
        m.display(head);

    }

    public Node build(int i, int j, int row, int column) {
        if(i + 1> row || j + 1> column)
            return null;
        Node n = new Node(1);
        n.right = build(i,j+1,row,column );
        n.down = build(i+1, j,row,column);
        return n;
    }

    public void display(Node head){
        Node down = head;
        Node right;
        while(down != null){
            right = down;
            while(right != null){
                System.out.print(right.val);
                right = right.right;
            }
            System.out.println();
            down = down.down;
        }
    }

    class Node {
        Node right;
        Node down;
        int val;

        Node(int val) {
            this.val = val;
        }
    }


}
