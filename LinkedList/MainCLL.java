package LinkedList;

public class MainCLL {
    public static void main(String[] args) {
        CLL list=new CLL();
        list.insert(2);
        list.insert(4);
        list.insert(25);
        list.insert(32);
        list.insert(82);
        list.insert(20);
        list.display();
        list.insert(99);
        list.display();
    }
}
