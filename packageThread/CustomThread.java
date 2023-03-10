package packageThread;

public class CustomThread extends Thread {

    private boolean shouldExit = false;

    public void setShouldExit(boolean shouldExit) {
        this.shouldExit = shouldExit;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            if (shouldExit) {
                break;
            }
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
