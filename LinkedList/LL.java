package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    int size;

    public LL(int size) {
        this.size = 0;
    }

    private static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
