package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseALinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Anupriya");
        list.add("Dimpal");
        list.add("Shadab");
        list.add("Imran");
        list.add("Shubham");
        list.add("Bhupinder");
        System.out.println(list);

        Iterator<String> iterator= list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
