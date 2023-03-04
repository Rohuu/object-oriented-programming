package package1;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am gonna be a Developer");
    }

    @Override
    void partner() {
        System.out.println("I love Spider-Girl");
    }
}
