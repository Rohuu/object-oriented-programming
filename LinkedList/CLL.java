package LinkedList;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        node.next=head;
        tail.next=node;
        tail=node;
    }

    public void display(){
        Node node=head;
        while (node!=tail){
            System.out.print(node.value+ " ");
            node=node.next;
        }
        System.out.print(tail.value+ " ");
        System.out.println("HEAD");
    }


    private class Node{
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
