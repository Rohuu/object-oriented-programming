package package1;

// multiple catch for a try is OK
// if java is not able to find the appropriate catch then it will move ahead and check another catch
// if that is desirable then it will throw that exception
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println(4/0);
            System.out.println("This will never be printed if exception occurs");
        }
        catch (NullPointerException e){
            System.out.println("Exception: "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: "+e.getMessage());

        }
        catch (ArithmeticException e){
            System.out.println("Exception: "+e.getMessage());
            // here java will check above two exception
            // both are not right then this ArithmeticException will be executed.
        }
        System.out.println("Final-Message: this msg will not be printed if java's default try-catch would run");
    }
}
