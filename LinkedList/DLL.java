package LinkedList;

public class DLL {
    private Node head;
    int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node; // head can be null when we are inserting for the first time, so tackle null pointer exception
        }
        head = node;
    }

    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.value+" ");
            last=node;
            node=node.next;
        }
        System.out.println("END");

        System.out.println("Printing in reverse: ");
        while (last!=null){
            System.out.print(last.value+ " ");
            last=last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val){
        Node node=new Node(val);
        Node last=head;

        node.next=null;

        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while (last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
