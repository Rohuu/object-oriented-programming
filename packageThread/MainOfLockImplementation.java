package packageThread;

import java.util.ArrayList;
import java.util.List;

public class MainOfLockImplementation {
    public static void main(String[] args) throws InterruptedException {
        List<Character> list = new ArrayList<>();
        Thread thread1 = new StringReverseThread(list, "HELLO");
        thread1.start();
        Thread thread2 = new StringReverseThread(list, "WORLD");
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
