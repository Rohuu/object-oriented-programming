package package1;

import java.util.Arrays;

public class MainOfWatch {
    public static void main(String[] args) throws CloneNotSupportedException {
        Watch casio=new Watch(5100,"Olive Green" , new int[]{1,2,3,4});
        Watch fakeWatch=(Watch)casio.clone();
        System.out.println(Arrays.toString(casio.arr));   // [1, 2, 3, 4]
        System.out.println(Arrays.toString(fakeWatch.arr));  // [1, 2, 3, 4]
        // now if we make any changes in fakeWatch
        fakeWatch.arr[0]=5;
        System.out.println(Arrays.toString(casio.arr));   // [5, 2, 3, 4]
        System.out.println(Arrays.toString(fakeWatch.arr));   // [5, 2, 3, 4]
        // you see... we changed value in fake object
        // but the original object also got changed
        // this is called shallow copy
        // means when we will make copy of objects then primitive types will be copied as it is
        // but non primitives will be referring to same variables
        // if we don't want that then we make deep copy of object
        // where every data-type from one object is copied to another object
        // thus change in the copied object will not impact the original object
    }
}
