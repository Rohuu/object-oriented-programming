package package1;

public class Box {
    double length; // if we write private double length, then length will be accessible in this class only
    double width;   // not even from its child class
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

        // parent class can't access the properties of child class
        // but......

        Box box10=new BoxWithWeight(5,6,8,7);
        // now can box10.weight is possible
        // answer is NO... coz weight is initialized in child class.
        // here reference variable can be Parent class type but the object is of child class only
        // so by the reference of parent class, we can access properties of only parent class.
        // System.out.println(box10.weight); //gives error
        // but........
        System.out.println(box10.length+box10.width+box10.height);
        // all this is perfectly fine.

        // BoxWithWeight box11=new Box(1,2,3,4);
        // we are using BoxWeight class reference, so we can access the properties of BoxWeight class but but but
        // but we are calling the constructor of parent class
        // this too is giving error coz... constructor of box class doesn't know how to set weight
        // parent class can't call the constructor of child class.


        // above classes don't know what classes are below but
        // below classes know what classes are above
    }

}
