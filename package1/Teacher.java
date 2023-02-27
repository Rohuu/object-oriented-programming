package package1;


public class Teacher {
    static String name;
    int salary;

    public Teacher(int salary, String name) {
        this.salary = salary;
        Teacher.name = name;
    }


    public static void main(String[] args) {
        Teacher t1 = new Teacher(10000, "Rahul");
        Teacher t2 = new Teacher(15000, "Kamal");
        Teacher t3 = new Teacher(20000, "Yogesh");
        System.out.println(t1.name); // here name will be set to Rahul
        System.out.println(t2.name); // here name will be set to kamal
        System.out.println(t3.name); // here name will be set to Yogesh
        // but name is static variable and at last it will set each name to Yogesh in runtime and will print
        // Yogesh
        // Yogesh
        // Yogesh
    }
}
