package packageThread;

public class CustomThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 30 ; i++) {
            System.out.println("Thread is running");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread is completed");
    }
}
