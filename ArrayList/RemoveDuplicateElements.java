package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String...a){

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,3,4));

        // 1. LinkedHashSet

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);

        ArrayList<Integer> numbersListWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);

        System.out.println(numbersListWithoutDuplicates); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]

        System.out.println(linkedHashSet); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]

        //2. JDK 8 - stream:

        ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6));
        List<Integer> uniqueNumbers1= numbers1.stream().distinct().collect(Collectors.toList());
        List<Integer> uniqueNUmbers2 = numbers1.stream().distinct().toList();
        System.out.println(uniqueNumbers1);
        System.out.println(uniqueNUmbers2);

    }
}
