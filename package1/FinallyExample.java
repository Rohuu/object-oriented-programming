package package1;

public class FinallyExample {
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
            // if this too is not the appropriate one then java default try-catch will work.
        }
        finally {
            // inside finally everything will be run in any case
            // whether our try-catch is working or java's try-catch
            // this will run 100%

            System.out.println("Finally-Message: this will be printed 100%, in any case");
        }
        System.out.println("Last-Message: this msg will not be printed if java's default try-catch would run");
        // if java default try-catch will work then this will not be printed
        // if our try-catch will work then this will be printed

    }
}
