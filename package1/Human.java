package package1;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    long population;
    // right now population is instance variable it will be printed separately for every instance
    // but population is not something which will be separate for every object instance

    public Human(int age, String name,int salary, boolean married) {
        this.age = age;
        this.salary = salary;
        this.married = married;
        this.population += 1;
    }

    public static void main(String[] args) {
        Human rohit=new Human(25,"Rohit",150,false);
        Human saanu=new Human(26,"Saanu",250,true);
        System.out.println(rohit.population); // 1
        System.out.println(saanu.population); // 1
        //ideally output should be 1 then 2.
    }
}
