package packageThread;

public class FirstMainThread {
    public static void main(String[] args) {
        Thread firstThread=Thread.currentThread();
        System.out.println("Current Thread: "+firstThread.getName());

        // set name
        firstThread.setName("First main thread");
        System.out.println(firstThread.getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Printing this after sleep-time.... ");
    }
}
