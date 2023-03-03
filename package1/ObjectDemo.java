package package1;

import com.sun.security.jgss.GSSUtil;

public class ObjectDemo {
    int id;
    int marksOutOfHundred;

    public ObjectDemo(int id, int marksOutOfHundred) {
        this.id=id;
        this.marksOutOfHundred=marksOutOfHundred;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

//    @Override
//    public boolean equals(Object obj) {
//        return this.id==((ObjectDemo)obj).marksOutOfHundred;
//    }

    public static void main(String[] args) {
        ObjectDemo objectDemo1 = new ObjectDemo(5,70);
        ObjectDemo objectDemo2 = new ObjectDemo(7,50);
        System.out.println(objectDemo1.hashCode());
        System.out.println(objectDemo2.hashCode());
        // reference.hashcode() always prints random integer
        // not the memory address

    }
}
