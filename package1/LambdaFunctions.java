package package1;

// lambda functions are inline functions, means when in any method there is only one line then we can
// replace it with lambda functions.
// most of the time we don't need the name of the function as well, just write what it does....

import java.util.ArrayList;
import java.util.List;

public class LambdaFunctions {
    public static void main(String[] args) {
    List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }

//        for (int item:list) {
//            System.out.println(item*2);
//        }

        // converted above process to one line only, this is called lambda functions.
        list.forEach((item) -> System.out.println(item*2));

    }
}
