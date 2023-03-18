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
         while (temp!=null){
            System.out.print(temp.value+ " ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int value) {
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
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
