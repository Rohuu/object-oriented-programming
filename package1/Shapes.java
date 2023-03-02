package package1;

public class Shapes {
    void area(){
        System.out.println("I am in shapes");
    }

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.area();
        Shapes shapes1=new Circle();
        shapes1.area();
        // it will run area method in Circle class
        // obj decides which one to run, reference decides which one to access
        Shapes shapes3=new Triangle();
        shapes3.area();
        // here shape3 is the reference variable of Shape class but when we are calling shape3.area it is printing the area of triangle
        // coz no matter what the reference is but the object is of Triangle class, that's why it printed triangle's area
    }
}


// this void area function is being overridden by Circle, Squre, Triangle class //


// polymorphism
//// compile time polymorphism & run time polymorphism
// compile time polymorphism
/////// method overloading, constructor overloading
// run time polymorphism
/////// method overriding- like overriding the method by child class which is in parent class
