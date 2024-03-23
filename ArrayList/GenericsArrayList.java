package ArrayList;

import java.util.ArrayList;
public class GenericsArrayList {
     public static void main(String... a){
        ArrayList<Integer> marksList = new ArrayList();
        marksList.add(100);

        //marksList.add(12.33);
        // java: incompatible types: double cannot be converted to java.lang.Integer

         ArrayList<Double> ard = new ArrayList();
         ard.add(12.33);
         //ard.add(20);
         //java: incompatible types: int cannot be converted to java.lang.Double

         ard.add(20.0);
         //this will work

         ArrayList<String> studentNames = new ArrayList();
         studentNames.add("Tom");

         //ArrayList<int> marksInt1= new ArrayList<int>();
         //this is not allowed

         ArrayList<Integer> marks = new ArrayList<Integer>();
         //this is allowed


    }
}
