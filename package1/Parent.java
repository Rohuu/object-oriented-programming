package package1;

import java.lang.ref.PhantomReference;

// abstract class
// an abstract class can't be final because final keyword stops the class from being inherited.
public abstract class Parent {
    // abstract methods
    // make that method abstract, if you know that have to be implemented by the child classes
    // abstract method are simple definition, parameters without body.
    // body will be implemented or overridden by child class.

    int age;

    //  can we make constructor of an abstract class
    // yes......
    // but can we call it.... ?
    // let's check by making its object in main...
    public Parent(int age) {
        this.age = age;
    }
    // so we can make constructor of abstract classes, but can't call it

    // can we create abstract constructor.......?
//    abstract Parent(int age){
//        this.age=age;
//    }
    // NO

    abstract void career();


    abstract void partner();
}
