package package1;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    long population;
    // right now population is instance variable it will be printed separately for every instance
    // but population is not something which will be separate for every object instance

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.salary = salary;
        this.married = married;
        this.population += 1;
    }

    public static void main(String[] args) {
        Human rohit = new Human(25, "Rohit", 150, false);
        Human saanu = new Human(26, "Saanu", 250, true);
        System.out.println(rohit.population); // 1
        System.out.println(saanu.population); // 1
        //ideally output should be 1 then 2.
    }
}

class HomoSapiens {
    int age;
    String name;
    static String company="HCL";
    boolean married;
    static long population;// population is not related to any particular object
    // but it is common and same for all objects, that's why it is static


    public HomoSapiens(int age, String name, boolean married) {
        this.age = age;
        this.name = name;
        this.married = married;
        this.population+=1;
    }

    public static void main(String[] args) {
        HomoSapiens rohita=new HomoSapiens(12,"Rohita",false);
        HomoSapiens sagar=new HomoSapiens(11,"Sagar",false);
        System.out.println(rohita.company);
        System.out.println(sagar.company);
        System.out.println(rohita.population);// now it will print 2
        System.out.println(sagar.population);// this too will print 2
        //coz population is same for each object
    }
}
