package interfaces;

public class C implements B{
    // since interface B extends interface A
    // And we are implementing B interface
    // that's why we have to override methods of both child as-well-as parent interface.

    @Override
    public void fun() {

    }

    @Override
    public void greet() {

    }
}
