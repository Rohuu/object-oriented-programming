package package1;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        // a. will not give many options but num. will give us many options since it is
        // an object of class Integer.
        // or we can do this by making object of Integer class as well
        Integer num = 45;
        // this is now created as an object.

        //////// final keyword
        final int increase = 1;
        increase = 3;
        // this will give error because increase variable is final type and we cant
        // change final values.
        // and final variables have to be initialized.

    }
}
