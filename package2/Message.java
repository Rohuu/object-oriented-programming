package package2;
import static package1.Greeting.greeting;
public class Message {
    public static void main(String[] args) {
        System.out.println("this is pakcage2");
        greeting();

        // like this we can call method from other class in other package also
        //static import packcge name.class.method;
    }
}
