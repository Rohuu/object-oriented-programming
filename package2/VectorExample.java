package package2;

import java.util.List;
import java.util.Vector;

// only a single thread can access vector at a time whereas multiple thread can access arraylist at a time.
// so arraylist is faster

// vector is not that fast
public class VectorExample {
    public static void main(String[] args) {
        List<Integer> vector= new Vector<>();
        vector.add(45);
        vector.add(457);
        vector.add(74);
        vector.add(69);
        vector.add(97);
        System.out.println(vector);
        vector.remove(2);
        System.out.println(vector);
        vector.add(2,0);
        System.out.println(vector);

    }
}
