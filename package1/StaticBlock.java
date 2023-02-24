package package1;

// initialization of static variables
public class StaticBlock {
    static int a=4;
    static int b;

    //static block: it gets executed exactly once when the first obj is created
    // means only when the class is loaded....
    static{
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+", "+StaticBlock.b);
        // will print 4, 20

        StaticBlock.b+=1;
        System.out.println(StaticBlock.b);
        // will print 21

        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+", "+StaticBlock.b);
        // will print 4, 21

        // noticed that "I am in static block" printed only once even after making obj again
        // coz stuff inside static block will execute only once when memory is loaded...
    }
}
