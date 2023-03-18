package LinkedList;

import org.w3c.dom.Node;

public class MainLL {
    public static void main(String[] args) {
        LL list= new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list. insertLast(4);
        list.insertLast(99);
        list.insertLast(999);
        list.insert(100,3);
        list.display();
        int deletedNumber=list.deleteFirst();
        System.out.println("Deleted number is: "+deletedNumber);
        list.display();
        System.out.println("Deleted number is: "+list.deleteLastElement());
        list.display();
    }
}
