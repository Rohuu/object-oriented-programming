package package1;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I wanna be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Spider-Man");
    }
}
