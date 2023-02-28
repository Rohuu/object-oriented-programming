package package1;

public class Box {
    double length;
    double width;
    double height;

    Box() { // constructor with default set values
        this.length=-1;
        this.width=-1;
        this.height=-1;
    }

    // cube
    Box(double side){ // constructor with single value
        this.length=side;
        this.width=side;
        this.height=side;
    }

    public Box(double length, double width, double height) { // constructor with all three values
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box old){ // constructor with object as a parameter
        // so that we can manipulate the properties of already created objects
        this.length= old.length;
        this.height= old.height;
        this.width=old.width;
    }
    public void information(){
        System.out.println("Running the box");
    }

    public static void main(String[] args) {
        Box box1=new Box();
        System.out.println(box1.length+" "+box1.width+" "+box1.height);
        Box box2=new Box(5);
        System.out.println(box2.length+" "+box2.width+" "+box2.height);
        Box box3=new Box(4,5,6);
        System.out.println(box3.length+" "+box3.width+" "+box3.height);
        Box box4=new Box(box3);
        System.out.println(box4.length+" "+box4.width+" "+box4.height);
    }
}
