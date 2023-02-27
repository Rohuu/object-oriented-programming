package package1;

// class which can have only one object is called singleton class
// we can make new objects by calling constructor
// so if we want to make only 1 object then definitely we
// have to stop people by using its constructor
// so make is private
public class Singleton {
    private Singleton() {   // now this is private and can be accessed in this class only.

    }

    private static Singleton instance;

    public static Singleton getInstance() { //make a method which gives Singleton object
        if (instance == null) { // check if there isn't any obj
            instance = new Singleton(); // if no obj, then create
        }
        return instance;
    }
}

class MainImpl {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance(); // calling getInstance method and getting the object once
        Singleton obj2=Singleton.getInstance();
        // can call it and give it multiple reference variables, but it will always give the same instance
    }
}
