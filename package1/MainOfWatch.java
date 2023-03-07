package package1;

public class MainOfWatch {
    public static void main(String[] args) throws CloneNotSupportedException {
        Watch casio=new Watch(5100,"Olive Green");
        Watch fakeWatch=(Watch)casio.clone();
        System.out.println(fakeWatch.price);
        System.out.println(fakeWatch.color);
    }
}
