package packageThread;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LockImplementation extends Thread {
    private final List<Character> names;
    private final String message;
    private final Lock lock = new ReentrantLock();
    // now instead of using synchronization we will use lock

    public LockImplementation(List<Character> names, String message) {
        this.names = names;
        this.message = message;
    }

    @Override
    public void run() {
        // write code inside beneath of lock.lock(); in a try block
        lock.lock();
        try {
            System.out.println("Lock aquired by: " + Thread.currentThread().getName());
            for (int i = 0; i < message.length(); i++) {
                try {
                    names.add(message.charAt(i));
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(LockImplementation.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            System.out.println(names);
        } finally {
            lock.unlock();
            System.out.println("Lock unlocked by: " + Thread.currentThread().getName());
            // it is important to unlock the lock every time otherwise the next thread will be stayed in waiting list
            // this is called starvation...
        }
    }
}
