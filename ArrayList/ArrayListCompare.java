package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {
    public static void main(String... a){
        //1. SOrt and Compare Exercise
        ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("a","b","c","d"));
        ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("a","b","c","d"));
        System.out.println(l1.equals(l2));

        ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("d","b","c","a"));
        ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("a","b","c","d"));
        System.out.println(l3.equals(l4));

        ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("d","b","c","a"));
        ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("a","b","c","d"));
        Collections.sort(l5);
        Collections.sort(l6);
        System.out.println(l5.equals(l6));

        //2. compare two list - find out the additional elements in the second list:
        ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("a","b","c","d"));
        ArrayList<String> l8 = new ArrayList<String>(Arrays.asList("a","b","c","e"));
        //l8.removeAll(l7);
        System.out.println(l8); //e

        // 3. find out the missing elements:
        l7.removeAll(l8);
        System.out.println(l7); //d

        //4. find out the common elemetns:
        ArrayList<String> l9 = new ArrayList<String>(Arrays.asList("a","b","c","d"));
        ArrayList<String> l10 = new ArrayList<String>(Arrays.asList("a","b","c","e"));
        l9.retainAll(l10);
        System.out.println(l9); //[a, b, c]





    }
}
