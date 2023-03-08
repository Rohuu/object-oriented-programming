package packageThread;

public class NewThread implements Runnable{

    @Override
    public void run() {
        System.out.println("The wait will over in . . .");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Here is your: "+Thread.currentThread().getName());

    }

    public static void main(String[] args) {
//        NewThread newThread=new NewThread();  // either instantiate runnable then pass its object
        Thread thread=new Thread(new NewThread());  // or directly pass object of runnable
        thread.start();
        thread.setName("Unique thread");
    }
}
