package packageThread;

public class ThreadSleep {
    public static void main(String[] args) {
        Runnable runnable =()->{
          String threadName= Thread.currentThread().getName();
            System.out.println(threadName+" is running");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName+" finished");
        };
        Thread thread=new Thread(runnable,"Unique thread");
        thread.start();
    }
}
