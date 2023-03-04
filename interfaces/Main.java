package interfaces;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        car1.stop();
        car1.acc();
        car1.brake();
        Engine e1=new Car();
        // e1.a;
        //  e1 is reference variable of Engine(e1 is Engine type), so we can access only those things which are present in Engine class
        // e1.acc();
        // it will run the method which will be present in Car class coz object is of Car class.

        // now we want to start and stop the media of the car...
         Media media1=new Car();
         media1.start();
         media1.stop();
         // HAHAHAHAHA , we tried to stop songs, but it stopped the engine
        // coz, start(),end() methods are in Engine interface also and in Media interface also
        // And when we overrode methods that time only Engine's methods were overridden

        // to deal with this we have to make separate classes and separately implement each interface so that this problem doesn't occur
        // now we will make three separate classes and separately implement Engine, Brake, Media interface.
    }
}
