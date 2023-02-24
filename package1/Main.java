package package1;

// only a static function can be accessed from a static function.
// but a static fun can be accessed from a non static functions as well.

public class Main {
    public static void main(String[] args) {   // doesn't belong to an instance
//        greeting();
        //we can't call a non static method/data from a static method
        //how can something which requires instance to be called, can be accessed from a method which doesn't
        // need instance to be called

    }

    void greeting() { // belongs to an instance
        System.out.println("hello world");
    }

    static void callFun(){ // doesn't belong to an instance
        System.out.println("Hi");
//        haveFun();
        // same non-static methods(haveFun method) can't be called from a static method(callFun method).
    }

    void haveFun() {  // belongs to an instance
        callFun();
        // we can call static method from a non static method... no problem
    }
}
