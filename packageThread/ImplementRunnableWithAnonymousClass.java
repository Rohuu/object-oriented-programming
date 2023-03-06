package packageThread;

public class ImplementRunnableWithAnonymousClass {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread starts");
                System.out.println("Thread ends");
            }
        };

        Thread thread=new Thread(runnable);
        thread.start();
    }
}
