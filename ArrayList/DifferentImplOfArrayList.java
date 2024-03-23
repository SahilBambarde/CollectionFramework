package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferentImplOfArrayList {
    //list with other collection:

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
        System.out.println(numbers);
        //[10, 20, 30, 40]

        System.out.println();

        ArrayList<String> names = new ArrayList<String>(Arrays.asList("java","python","js","php"));
        System.out.println(names);
        System.out.println(names.size());
        //[java, python, js, php]

        System.out.println();

    }
}
