
class LinkedList<T> {

    class Node<T> {

        private Node<T> next;
        private T data;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return this.data.toString();
        }
    }

    private Node<T> first = null;

    public void addFirst(T data) {
        Node<T> newFirst = new Node<>(data);
        newFirst.next = this.first;
        this.first = newFirst;

    }

    public T removeFirst() {
        Node<T> oldFirst = this.first;
        first = first.next;
        return oldFirst.data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = first;
        while (current != null) {
            sb = sb.append(current).append(" ");
        }
        return sb.toString();

    }

    public boolean isEmpty() {
        return first == null;
    }

}

public class StackWithNode<T> {

    LinkedList<T> linkedList = new LinkedList<>();

    public void push(T data) {
        linkedList.addFirst(data);
    }

    public T pop(T data) {
        return linkedList.removeFirst();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }

}
