package package1;

public class DivideOperation {
    public static void main(String[] args) {
        performDivision();
        operationsInString();
        System.out.println("This will not be printed");

        // here java's default try-catch mechanism will work and will print weird message
        // after exception programme will be ended
        // "This will not be printed" will never print
        // to tackle with this problem we make our own try-catch
        // so that we can print a good msg that user can understand
        // and programme doesn't end.
    }

    private static void operationsInString() {
        String s = null;
        System.out.println("length: "+s.length());
        // java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
        // null pointer exception because we are performing actions on null values
    }

    static void performDivision(){
        System.out.println("Ans: "+5/0);
        // output: java.lang.ArithmeticException: / by zero
        // programmes like these and may more conditions where there could be errors not in compile time
        // but in run time, throw exception in run time
        // that's why to deal with these conditions we need exception handling

        // java's default catch mechanism works here which throws exception, prints the msg & ends the program
        // dis-advantage: after that exception program will be over.
    }
}
