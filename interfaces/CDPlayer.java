package interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Rock music starts");
    }

    @Override
    public void stop() {
        System.out.println("Music stops");
    }
}
