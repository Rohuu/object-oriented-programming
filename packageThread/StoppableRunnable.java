package packageThread;

// java Thread class has a method called thread.stop. But we should not use it coz
// you don't know where has your thread stopped in the code,which leaves your application in an undefined state
// it's better manage stopping yourself
public class StoppableRunnable implements Runnable {
    private boolean stopRequested=false;

    private synchronized void requestStop(){
        this.stopRequested=true;
    }
    private synchronized boolean isStopRequested(){
        return this.stopRequested;
    }

    private void sleepThread(long timeInMillis){
        try {
            Thread.sleep(timeInMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        System.out.println("StoppableRunnable is running");
        while(!isStopRequested()){
            sleepThread(2000);
            System.out.println("...");
        }
        System.out.println("StoppableRunnable Stopped");
    }

    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable=new StoppableRunnable();
        Thread thread=new Thread(stoppableRunnable,"Unique thread");
        thread.start();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Requesting to stop thread");
        stoppableRunnable.requestStop();
        System.out.println("Unique thread stopping");
    }
}
