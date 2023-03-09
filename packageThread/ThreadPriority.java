package packageThread;

public class ThreadPriority {
    public static void main(String[] args) {

        Thread thread = new Thread();
        CalculatorRunnable calculatorRunnable = new CalculatorRunnable(30000000000L);
        Thread thread1 = new Thread(calculatorRunnable);
        thread1.setName("High priority thread");
        thread1.setPriority(10);
        thread1.start();

        Thread thread2 = new Thread(calculatorRunnable);
        thread2.setName("Low priority thread");
        thread2.setPriority(1);
        thread2.start();

        Thread thread3 = new Thread(calculatorRunnable);
        thread3.setName("Normal priority thread");
        thread3.setPriority(5);
        thread3.start();
    }
}
