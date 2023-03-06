package packageInterfaces;

// interface: interfaces contains abstract functions(functions without body)
// its like abstract class only ... functions are public and abstract..... and variables are static and final by default in interfaces.
// interfaces mostly specifies like what the class is doing not how it is doing it.
// how it is doing is specifies by the child classes which implements the interface
// abstract class can have some information but interface can't
// abstract classes can have any type of methods default,static,abstract methods
// in interface variables are final
// coz we have no constructor in interface
// if no constructor then how will we initialise values, that's why they are final
// but
// in interface, inside methods variables can be final or non-final.
// abstract classes can be extended by using extends keyword
// interfaces can be implemented by using implements keyword
// abstract classes can't be multiple inherited, but we can implement more than one interfaces
// 2 classes which are un-related to each other can also implement the same interface.
public interface Engine {
//    static final int PRICE=78000;
    // here it is obvious that variable will be static and final
    // so no need to write that

    int PRICE=78000;

    void start();

    void stop();

    void acc();
}
