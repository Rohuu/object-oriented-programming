package packageThread;

public class CustomThreadPauseResume {
    public static void main(String[] args) {
        CustomThread customThread=new CustomThread();
        customThread.start();
        System.exit(0);
        // exited instantly without letting customThread start coz of
    }
}
