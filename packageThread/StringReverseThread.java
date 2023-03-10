package packageThread;

import java.util.List;

public class StringReverseThread extends Thread {
    private List<Character> names;
    private String message;

    public StringReverseThread(List<Character> names, String message) {
        this.names = names;
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (names) {
            // in parameter of synchronized, we can pass only shared resource, which is list here...
            // and we have to write our code inside that synchronized method/keyword
            for (int i = 0; i < message.length(); i++) {
                names.add(message.charAt(i));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(names);
        }
    }
}
