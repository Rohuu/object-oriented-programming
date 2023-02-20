public class Student {
    // class is the name group of properties and functions
    // class is a template of an object
    // class is just a logical construct
    // class creates a data type that we can use to create objects

    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public Student() {
        this.rollNo = rollNo;
        this.name = name;
    }

    public static void main(String[] args) {

        // object is the instance of a class.
        // object is physical reality
        // when we create an object of a class means we are creating instance of the
        // class
        // instance means : physical stuff of the class
        // ex- babies are instance of human class
        // objects are stored in heap memory & reference variables are stored in stack
        // memory

        Student student1;
        // declaring object student1;
        // it is reference variable right now, will be in stack memory and pointing to
        // null.

        student1 = new Student();
        // now new allotes the memory in run time (or dynamically allotes memory) and
        // returns a reference to it.
        // now the object of the student which is student1 is stored in heap memory.
    }
}
