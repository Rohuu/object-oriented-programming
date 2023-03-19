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

    public Node getIndex(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public Node getNode(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public int deleteLastElement(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondLast=getIndex(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLastElement();
        }
        Node prev=getIndex(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
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
