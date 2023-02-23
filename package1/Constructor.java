package package1;

public class Constructor {

    int rollNo;
    String name;

    Constructor rohit = new Constructor();

   // Constructor() {
        // rohit.rollNo=1;         // we can make like this also... but for every new object we have to create
        // rohit.name="rohit";          // different constructor.
    //   this.rollNo = rollNo;              // so we write "this".
    //    this.name = name;
        // this is now constructor with no parameter.
        // we have to set values while making object, in this case.
        // other option is parameterised constructor.

    //}

    Constructor(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;

        // in this way now just make object and pass values in that as parameters.

    }

    // if we pass no parameters then above constructor will be called, if 2
    // parameters then the lower one is called
    // that is called constructor overloading.

    //////// Calling constructor from another constructor

    Constructor() {
        // now we are calling parameterised constructor from this constructor using this
        // keyword.
        this(2, "kamal");
    }







        // constructor is special function that runs when we create an object and it
        // allocated some variables.
        // here its a bydefault constructor.
        // and we can make our own constructor as well, just give in parameters.


}
