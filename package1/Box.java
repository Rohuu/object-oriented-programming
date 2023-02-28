package package1;

public class Box {
    double length;
    double width;
    double height;

    Box() { // constructor with default set values
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    // cube
    Box(double side) { // constructor with single value
        this.length = side;
        this.width = side;
        this.height = side;
    }

    public Box(double length, double width, double height) { // constructor with all three values
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box old) { // constructor with object as a parameter
        // so that we can manipulate the properties of already created objects
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void information() {
        System.out.println("Running the box");
    }

    public static void main(String[] args) {
        // box with no parameters
        Box box1 = new Box();
        System.out.println(box1.length + " " + box1.width + " " + box1.height);
        // box with 1 parameter
        Box box2 = new Box(5);
        System.out.println(box2.length + " " + box2.width + " " + box2.height);
        // box with all three parameters
        Box box3 = new Box(4, 5, 6);
        System.out.println(box3.length + " " + box3.width + " " + box3.height);
        // box with having object as parameter
        Box box4 = new Box(box3);
        System.out.println(box4.length + " " + box4.width + " " + box4.height);
        // making object of BoxWithWeight class
        // then calling its constructor where we have set only weight
        // rest values it will access from the default constructors of its parent class
        BoxWithWeight box5 = new BoxWithWeight();
        System.out.println(box5.weight + " " + box5.length + " " + box5.width + " " + box5.height);
        // now we want to give all 4 properties manually
        // but length, width and height are initialised in Box class and weight in BoxWithWeight class
        // So we have to call the Box class constructor with all properties inside BoxWithWeight class constructor
        // it will call the parent class constructor by using super keyword in constructor

        BoxWithWeight box6 = new BoxWithWeight(1, 2, 3, 4);
        System.out.println(box6.weight + " " + box6.length + " " + box6.width + " " + box6.height);
    }
}
