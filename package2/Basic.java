package package2;

public class Basic {
    // all the enums explicitly extend java.lang.enum class
    // so enum can't extend anything else coz multiple inheritance is not allowed in java
    // but enum can implement as many interface as we want
    enum Week{
        // when we need fix group of objects then we need enums
        // like week days, months etc etc
        Monday, Tuesday, Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constants
        // all are public, static and final member
        // if they are static, then they are called by class name which is Week
        // since its final,so we can create child enums

        // internally: public static final Week Monday= new Week();


        Week() {
            System.out.println("Constructor called for "+this);
            // this represents in elements of the class
        }
        // this is not public or protected, only private or default
        // if it was public, then it would allow us to initialise more than one object
        // we only want constant no of objects in week
        // that's why it's not public
    }

    public static void main(String[] args) {
//        Week week=Week.Tuesday;
//
//        for (Week day:Week.values()) {
//            System.out.println(day);
//        }
//        System.out.println(week);
//
//        System.out.println(week.ordinal());
        // prints position of week object's place

        // now constructor is created
        // let's run it for any day

        Week week=Week.Saturday;
        // output is:
//        Constructor called for Monday
//        Constructor called for Tuesday
//        Constructor called for Wednesday
//        Constructor called for Thursday
//        Constructor called for Friday
//        Constructor called for Saturday
//        Constructor called for Sunday

        // constructor ran for all days in week


    }
}
