package packageThread;

public class FirstMainThread {
    public static void main(String[] args) {
        Thread firstThread=Thread.currentThread();
        System.out.println("Current Thread: "+firstThread.getName());

        // set name
        firstThread.setName("First main thread");
        System.out.println(firstThread.getName());
    }
}
