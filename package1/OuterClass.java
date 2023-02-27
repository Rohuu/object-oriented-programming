package package1;

public class OuterClass {
    // outer class can't be static
    // because the outer class is not dependent on any other class
    // not because they can't be set to static but because All top-level classes are, by definition, static
    // whereas the inner class is dependent on the outer class, so it can be static
    // 'public static class OuterClass' // this will throw error'
    static class InnerClass{
        // inner class can or can not be static
        // whereas the inner class is dependent on the outer class, so it can be static
    }
}
