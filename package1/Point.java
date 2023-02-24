package package1;

public class Point {
    public static void main(String[] args) {
        //greeting();
        // like this we can't access this method
        // we have to access with an object reference

        Point obj = new Point();
        obj.greeting();

        // by making object of the class, we can access non-static methods.
    }

    void greeting() {
        System.out.println("hello point classes");
    }

}
class AnotherPoint{
    public static void main(String[] args) {
    AnotherPoint anotherPoint=new AnotherPoint();
    anotherPoint.passed();
    }

    void checked(){
        System.out.println("Checked");
    }

    void passed(){
        System.out.println("Passed");
        checked();  // but in a non-static method, we can call another non-static method
        //coz at the end passed() would be called in main only and that time obj will be created
        // and that obj will take care of checked() as well...
    }

}
