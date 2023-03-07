package package2;

import com.sun.security.jgss.GSSUtil;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constants
        // all are public, static and final member
        // if they are static, then they are called by class name which is Week
        // since its final,so we can create child enums
    }

    public static void main(String[] args) {
        Week week=Week.Tuesday;

        for (Week day:Week.values()) {
            System.out.println(day);
        }
        System.out.println(week);

        System.out.println(week.ordinal());
        // prints position of week object's place
    }
}
