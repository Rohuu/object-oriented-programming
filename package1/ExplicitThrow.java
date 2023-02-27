package package1;

public class ExplicitThrow {
    public static void main(String[] args) {
        int balance=5000;
        int withdrawlAmount=3500;
        try{
            if(withdrawlAmount>balance){
                throw new ArithmeticException("Insufficient funds");
                // Explicit throw an exception object
                // where we can add out own message as well
            }
            balance=balance-withdrawlAmount;
            System.out.println("Transaction successful");
            System.out.println("Remaining balance: "+balance);
        }
        catch (ArithmeticException e){
            System.out.println("Exception: "+e.getMessage());
        }
        System.out.println("Program continues....");
    }
}
