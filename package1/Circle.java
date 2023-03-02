package package1;

public class Circle extends Shapes{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void area(){
        System.out.println("area is pi * r * r");
    }
}
