package packageThread;

public class CustomThreadPauseResume {
    public static void main(String[] args) throws InterruptedException {
        CustomThread customThread=new CustomThread();
        customThread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(customThread.isAlive()){
            customThread.setShouldExit(true);
            customThread.join();
        }
        // now thread is completed properly and while running, it will show thread is completed at end even if we have stopped it in between, it will not be stopped abruptly
        System.exit(0);
        // exited instantly without letting customThread start coz of System.exit();
    }
}
