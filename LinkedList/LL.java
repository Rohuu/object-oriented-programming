package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node= new Node(value);
        node.next=head;
        head=node;

        if(tail==null){ // means this is the first item added or there is only one item
            // in that case head,tail,node all will be same
            tail=head;
        }
        size++;
    }

    public void display(){
        Node temp=head;
        System.out.print("START"+" ");
        while (temp!=null){
            System.out.print(temp.value+ " ");
            temp=temp.next;
        }
        System.out.println("END");
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
