package package1;

public class Watch implements Cloneable{
    int price;
    String color;
    int[] arr;

    public Watch(int price, String color, int[] arr) {
        this.price = price;
        this.color = color;
        this.arr=arr;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
