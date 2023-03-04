package interfaces;

public interface Greet {
    //static methods in interface will always have a body
    // And will be called via interface name
    static void greeting(){
        System.out.println("Hey!");
    }
    //abstract method
    void fun();
}
