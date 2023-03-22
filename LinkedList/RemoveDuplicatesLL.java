package LinkedList;
public class RemoveDuplicatesLL {
    private Node head;
    private Node tail;
    private int size;

    public RemoveDuplicatesLL() {
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

    public void insertLast(int value) {
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node= new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void removeDuplicates(){
        Node node=head;
        while (node.next!=null){
            if (node.value== node.next.value){
                node.next=node.next.next;
                size--;
            }
            else {
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

    public void display(){
        Node node=head;
        while(node.next!=null){
            System.out.print(node.value+ " ");
            node=node.next;
        }
        System.out.println(node.value+ " ");
        System.out.print("END");
        System.out.println();
    }

    private static class Node{
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicatesLL ll=new RemoveDuplicatesLL();
        ll.insertLast(1);
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(2);
        ll.insertLast(2);
        ll.insertLast(3);
        ll.insertLast(3);
        ll.insertLast(3);
        ll.insertLast(3);
        ll.insertLast(3);
        ll.display();
        ll.removeDuplicates();
        ll.display();
    }
}
