package package1;

public class MainOfParent {
    public static void main(String[] args) {
        Son son = new Son(24);
        System.out.println(son.age);
        son.age = 25;
        System.out.println(son.age);
        son.career();
        son.partner();
        Daughter daughter = new Daughter(46);
        daughter.career();
        daughter.partner();
        System.out.println(daughter.age);
        daughter.age = 47;
        System.out.println(daughter.age);
//        Parent parent=new Parent(45);
        // giving error because we can't instantiate the abstract class
        // it is asking me to override the abstract methods here only
        // important
        // ...
        // ...
        // we can't make object of abstract classes because...
//        Parent obj=new Parent(54);
        // now if we call obj.anyMethodOfAbstractClass
        // then it will give error
        // because methods inside abstract classes have no body.

        // although we can't make object of parent class but we can use parent class as reference variable
        Parent p1=new Son(45);
        // like this
        }
    }
