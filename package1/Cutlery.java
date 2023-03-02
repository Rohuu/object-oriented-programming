package package1;

public class Cutlery {
    int price;
    // price is not private so we can set the price without calling constructor
    private String design;
    // design is private , so we can't directly manipulate it without calling constructor.
    // indirectly we hided data from user, user can't access private properties, it can only get by getter function.
    // can hide data using getters and setters, that is ENCAPSULATION....
    // Encapsulation is hiding data like methods, properties etc, it is implementation level
    // whereas ABSTRACTION is hiding un-necessary details, it is design level
    // example: we don't know how does a car start, we only insert key.. that's it!
    public Cutlery(int price, String design) {
        this.price = price;
        this.design = design;
    }

    public int getPrice() {
        return price;
    }

    public String getDesign() {
        return design;
    }
}
