package package1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter a: ");
            int a=sc.nextInt();
            System.out.println("Enter b: ");
            int b=sc.nextInt();
            int result=a/b;
            System.out.println(result);
            System.out.println("Thank you!");
            // after exception anything in try block would not be printed;
        }
        catch (ArithmeticException e){

            // we made our own catch mechanism;
            // and if we pass the wrong Exception class object, let's say NullPointerException in this case
            // catch(NullPointerException e){
            // then java's default try-catch will work
            // and give weird msg, will not print Final-Message and end the programme after Exception
            System.out.println("Exception: "+e.getMessage());
        }
        System.out.println("Final-Message: this msg will not be printed if java's default try-catch would run");
    }
}
