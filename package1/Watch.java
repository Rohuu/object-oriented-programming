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

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        // this is shallow copy
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Watch fakeWatch=(Watch)super.clone();   // this is actually shallow copy

        // make a deep copy
        fakeWatch.arr=new int[fakeWatch.arr.length];
        for (int i = 0; i < fakeWatch.arr.length; i++) {
            fakeWatch.arr[i]=this.arr[i];
        }
        return fakeWatch;
    }
}
