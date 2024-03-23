package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String... a){
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("tom");//0
        studentList.add("navin");//1
        studentList.add("steve");//2
        studentList.add("liza");//3

        //using for loop
        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
            //tom
            //navin
            //steve
            //liza
        }

        System.out.println();

        // for each loop

        for(String s: studentList){
            System.out.println(s);
            //tom
            //navin
            //steve
            //liza
        }
        System.out.println();


        //using lamda fuction
        //this came for java 8
        studentList.stream().forEach(ele-> System.out.println(ele));

        System.out.println();

        //Iterator
        Iterator<String> it= studentList.iterator();
        //here Iterator is a interface with generics
        //as collection implements Iterable so it has to implement it too

        while(it.hasNext()){
            System.out.println(it.next());
        }






    }
}
