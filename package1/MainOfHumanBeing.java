package package1;

public class MainOfHumanBeing {
    public static void main(String[] args) {
        HumanBeing uniqueHuman=new HumanBeing(12,"Rohit");
        HumanBeing duplicateHuman=new HumanBeing(uniqueHuman);
        System.out.println(duplicateHuman.age);
        System.out.println(duplicateHuman.name);
    }
}
