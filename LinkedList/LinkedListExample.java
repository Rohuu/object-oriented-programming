package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Mohan");
        list.add("Ravi");
        list.add("Karan");
        list.add("Myra");
        list.add("Ipshita");
        System.out.println(list);
        list.remove("Myra");
        System.out.println(list);
        list.add(0,"Raka");
        System.out.println(list);
        list.add(0,"GuruJi");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        LinkedList<String> list2=new LinkedList<>();
        list2.add("Shubham");
        list2.add("Pankaj");
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list2);
        list2.addAll(list2);
        System.out.println(list2);
        list2.addAll(1,list2);
        System.out.println(list2);
        list2.addLast("gh");
        System.out.println(list2);
        list2.removeFirstOccurrence("Shubham");
        System.out.println(list2);
        list2.removeLastOccurrence("Pankaj");
        System.out.println(list2);
        list2.removeLast();
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);
    }
}
