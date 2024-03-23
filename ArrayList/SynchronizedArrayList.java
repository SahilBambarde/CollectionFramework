package ArrayList;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    public static void main(String[] args) {
        List<String> namesList = Collections.synchronizedList(new ArrayList<String>());

        namesList.add("java");
        namesList.add("python");
        namesList.add("ruby");

        //add and remove - we dont need explicit synchronization

        // to fetch / traverse , the value from the list -- we have to use explicit synchronization

        synchronized(namesList){
            Iterator<String> it = namesList.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
                //java
                //python
                //ruby
            }
        }

        System.out.println();


        //2
        //copyOnWriteArrayList -- it is a class : Thread-safe / synchronized already.
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
        empList.add("tom");
        empList.add("steve");
        empList.add("naveen");

        //we dont need explicit synchronixation for any operation: add/remove/traversing
        Iterator<String> it = empList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
