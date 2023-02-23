package package1;

import jdk.nio.mapmode.ExtendedMapMode;

public class Employee extends Person{
    private final int empId;

    public Employee(int id,String nm,String gen){
        super(nm,gen);
        this.empId=id;
    }

    @Override
    public void work() {
        if(empId==0){
            System.out.println("Not Working");
        }
        else {
            System.out.println("Working!");
        }
    }

    public static void main(String[] args) {
        // coding in terms of abstract classes
        Person student=new Employee(0,"Rohan","male");
        Person infant=new Employee(0,"Lakshita","female");
        Person employee1=new Employee(1,"Joey","female");
        // making objects by any of both classes
        Employee tempEmployee1=new Employee(0,"jack","male");
        Employee tempEmployee2=new Employee(0,"jill","female");
        Employee employee2=new Employee(2,"Sunder Pichaii","male");

        student.work();
        infant.work();
        employee1.work();
        tempEmployee1.work();
        tempEmployee2.work();
        employee2.work();

        tempEmployee1.changeName("Makra-1");
        tempEmployee2.changeName("Makra-2");

        System.out.println(student);
        System.out.println(infant);
        System.out.println(employee1);
        System.out.println(tempEmployee1);
        System.out.println(tempEmployee2);
        System.out.println(employee2);
            }
        }
