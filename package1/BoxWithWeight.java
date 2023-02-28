package package1;

public class BoxWithWeight extends Box{
    double weight;

    BoxWithWeight()
    {
        this.weight=45;
    }

    public BoxWithWeight(double length, double width, double height, double weight) {
        super(length, width, height); // calling the super class constructor
        this.weight = weight;
    }
}
