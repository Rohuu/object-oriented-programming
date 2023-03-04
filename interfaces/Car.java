package interfaces;


// now we are making a class which will implement engine,brake,media interface
// which is possible using interface

public class Car implements Engine,Brake,Media {

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

    @Override
    public void startMedia() {
        System.out.println("My media starts like a normal car");

    }

    @Override
    public void stopMedia() {
        System.out.println("My media stops like a normal car");
    }
}
