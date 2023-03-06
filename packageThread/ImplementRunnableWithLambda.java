package packageThread;

public class ImplementRunnableWithLambda {
    public static void main(String[] args) {
        // using lambda expression
        Runnable runnable =() -> {
            System.out.println("Thread starts");
            System.out.println("Thread ends");
        };

        Thread thread=new Thread(runnable);
        thread.start();
    }
}
