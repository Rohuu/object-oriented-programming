package package1;

public class HumanBeing{
        int age;
        String name;

        public HumanBeing(int age, String name) {
            this.age = age;
            this.name = name;
        }
        // this is one way of making copy of any object
        // the other way is, by implementing cloneable interface
        public HumanBeing(HumanBeing other) {
            this.age=other.age;
            this.name=other.name;
        }
    }