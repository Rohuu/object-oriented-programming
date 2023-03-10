package packageThread;

import java.util.ArrayList;
import java.util.List;
public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        List<Character> list=new ArrayList<>();
        Thread thread1=new StringReverseThread(list,"HELLO");
        thread1.start();
        // result is fine till now
        // but when we do this two or more threads
        Thread thread2=new StringReverseThread(list,"WORLD");
        thread2.start();

        thread1.join();
        thread2.join();
        // now we are starting two threads then we joined two threads & it gave very weird output
        // Output:  [H, W, E, R, L, L, D, O]
        //          [H, W, E, R, L, L, D, O]

        // it is a combination of both messages.
        // reason: it is because we are using the same resource which is same variable(list) in both thread.
        // we are starting both threads together and list is also same then they both will execute the run method together, simultaneously
        // And printing randomly from both messages
        // now
        // how to fix it........ ?
        // by using synchronization
        // we have to make different resource for different threads
        // for that we will make use of a keyword synchronized in overridden run method
    }
}
