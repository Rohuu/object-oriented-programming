package package1;

// Example of an abstract class
public abstract class Person {
    private String name;
    private final String gender;

    public Person(String nm,String gen){
        this.name=nm;
        this.gender=gen;
    }

    // abstract method- abstract method work() and it has no body //
    public abstract void work();

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + '}';
    }

    public void changeName(String newName){
        this.name=newName;
    }
}
