package packageThread;

public class CustomThreadPauseResume {
    public static void main(String[] args) {
        CustomThread customThread=new CustomThread();
        customThread.start();
        try {
            customThread.join(2000);
            // now we this will let the process happen for the given time and if that doesn't get executed in that time period then it will kill the process
            // But first it will wait for given time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
        // exited instantly without letting customThread start coz of System.exit();
    }
}
