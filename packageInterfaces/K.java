package packageInterfaces;

public interface K { //top interface can be public or default one
    public interface NestedInterface{ // but nested interface can be anything
        boolean isOdd(int num);
    }
}

class L implements K.NestedInterface {

    @Override
    public boolean isOdd(int num) {
        if(num%2==0){
            return false;
        }
        return true;
    }
}

class MainOfNested{
    public static void main(String[] args) {
        L obj=new L();
        System.out.println(obj.isOdd(5));
    }
}