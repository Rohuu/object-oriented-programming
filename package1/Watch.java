package package1;

public class Watch implements Cloneable{
    int price;
    String color;

    public Watch(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
