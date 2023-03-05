package comparator;

public class Main {
    public static void main(String[] args) {
        Student ram=new Student(58.65f,5);
        Student kamal = new Student(58.65f,1);
//        if(ram>kamal){
//            System.out.println("Ram is greater than Kamal");
//        }
        // now java is confused that what parameters it has to compare .   .   . marks or rollNo    ???
        // so, to solve this problem we have to implement Comparable interface

        // we can compare by using overridden method compareTo()

        if(ram.compareTo(kamal)==0){
            System.out.println("both ar equal");
        }
        else if(ram.compareTo(kamal)<1){
            System.out.println("Kamal has more marks");
        }
        else{
            System.out.println("Ram has more marks");
        }
    }
}
