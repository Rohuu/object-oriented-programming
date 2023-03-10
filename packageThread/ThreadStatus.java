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
        try {
            thread.join(2000);
            // if we will add time in parameter then this will wait for that particular time so that the earlier thread can be completed
            // if it is not completed within that time then this thread.join(); will kill the process.
            // now the called thread will be completed first
            // then the process will be killed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Joining completed");
        System.exit(0);
        // this will create a high priority thread and program will be exited, this will kill the above running thread

        // if we want this thread, to complete the running thread first, then kill the process
        // then we have to use Thread.join(); before killing the process
    }
}