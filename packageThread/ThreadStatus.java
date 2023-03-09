package packageThread;

public class ThreadStatus implements Runnable {
    long value;

    ThreadStatus(Long value) {
        this.value = value;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = 0; i < value; i++) {
            sum += i;
        }
    }

    public static void main(String[] args) {
        ThreadStatus threadStatus=new ThreadStatus(7000000000L);
        Thread thread=new Thread(threadStatus);
        thread.setName("Unique Thread");
        thread.start();

        while (thread.isAlive()){
            System.out.println("Thread is active");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread is completed");
    }
}