package package1;

public class CutleryMain {
    public static void main(String[] args) {
        Cutlery cutlery1=new Cutlery(150,"Indian");
        System.out.println(cutlery1.getDesign());
        cutlery1.price=34;
        System.out.println( cutlery1.getPrice());

    }
}

// abstraction is like
// suppose we are getting map or list as output but if we will give list or map as output then user can edit or manipulate the map or list
// which is not good
// make a class return map.get(element) in a method in that class
// thus user can have only that method as output,which can't be manipulated.
// thus we abstracted that out.....
