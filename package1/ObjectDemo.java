package package1;

import com.sun.security.jgss.GSSUtil;

public class ObjectDemo {
    int id;
    int marksOutOfHundred;

    public ObjectDemo(int id, int marksOutOfHundred) {
        this.id=id;
        this.marksOutOfHundred=marksOutOfHundred;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.id==((ObjectDemo)obj).marksOutOfHundred;
    }

    public static void main(String[] args) {
        ObjectDemo objectDemo1 = new ObjectDemo(5,70);
        ObjectDemo objectDemo2 = new ObjectDemo(7,50);
        System.out.println(objectDemo1.hashCode());
        System.out.println(objectDemo2.hashCode());
        // reference.hashcode() always prints random integer
        // not the memory address

//                if (objectDemo1 > objectDemo2) {
//            System.out.println("object1 is greater than object2");
//        }

        // here we are comparing two objects but java is confused which one value to compare
        // whether id or marksOutOfHundred
        // hence giving error

        // let's look at equality first

        if (objectDemo1 == objectDemo2) {
            // == is a comparator
            // == tells only whether both variable refers to same objects or not
            // checks memory address
            System.out.println("object1 is equal to object2 using == operator");
        }


        if(objectDemo1.equals(objectDemo2)){
            // .equals() is a method
            // and this compares the content inside variables
            // for that we have to override and write according to our need
            // from .equals() method we can compare any two properties
            // like id with marks as well
            // by using (return this.id==((ObjectDemo)obj).marksOutOfHundred;)
            System.out.println("object1 is equal to object2 using .equals() method");
        }

        ObjectDemo objectDemo4=new ObjectDemo(4,56);
        System.out.println(objectDemo4 instanceof ObjectDemo);
        // instanceof method   // will return true

        System.out.println(objectDemo4 instanceof Object);
        // true, coz every object is an instance of Object class
    }
}
