package packageThread;

public class StartMultipleThread {
    public static void main(String[] args) {
        Runnable runnable= () ->{
            String threadName=Thread.currentThread().getName();
            System.out.println(threadName + " is running");
        };

        Thread thread1=new Thread(runnable , "thread1");
        thread1.start();
        Thread thread2=new Thread(runnable , "thread2");
        thread2.start();
        Thread thread3=new Thread(runnable , "thread3");
        thread3.start();

        // we can start multiple threads but order is not specified
    }
}
