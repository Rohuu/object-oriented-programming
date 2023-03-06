package packageInterfaces;


// now we are making a class which will implement engine,brake,media interface
// which is possible using interface

public class Car implements Engine,Brake,Media {

//    int a=5;
    // can we access this by making the object of car but reference type is Engine...?
    // check Main class for this

    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }
}
