package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String... a){
        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("java");
        ar1.add("python");
        ar1.add("ruby");
        ar1.add("javascript");

        ArrayList<String> ar2= new ArrayList<String>();
        ar2.add("Testing");
        ar2.add("dev ops");

//        //this method is used to combine two arrayLists
//        ar1.addAll(ar2);
//        System.out.println(ar1);
//        //[java, python, ruby, javascript, Testing, dev ops]
//
//        //this will add the second array from specified point of index
//        ar1.addAll(2,ar2);
//        System.out.println(ar1);
//        //[java, python, Testing, dev ops, ruby, javascript, Testing, dev ops]
//
//        //this is clear all elements in ar1
//        ar1.clear();
//        System.out.println(ar1);
//        //[]

        ArrayList<String> cloneList =(ArrayList<String>)ar1.clone();
        System.out.println(cloneList);

        System.out.println(ar1.contains("python"));
        System.out.println(ar1.contains("c"));

        ar1.indexOf("ruby");
        System.out.println(ar1.indexOf("ruby")); //2
        System.out.println(ar1.indexOf("ruby")>0); //true


        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("naven","tom","naven","steve","lisa","naven"));
        System.out.println(list1); //[Naven, tom, steve, lisa]

        int i =list1.lastIndexOf("naven");
        System.out.println(i); //5

        int j = list1.lastIndexOf("test");
        System.out.println(j); //-1

        list1.remove(1);
        System.out.println(list1); // [naven, naven, steve, lisa, naven]

        list1.remove("lisa");
        System.out.println(list1); // [naven, naven, steve, naven]

        list1.remove("sahil");
        System.out.println(list1); //[naven, naven, steve, naven]
        //here it is outputing same list as sahil is not present in the list


        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numbers.removeIf(num -> num%2==0);
        System.out.println(numbers); //[1, 3, 5, 7, 9]


        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("naveen","tom","peter","steve","lisa","tom"));
        namesList.retainAll(Collections.singleton("tom"));
        System.out.println(namesList); //[tom, tom]


        ArrayList<Integer> numbers1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        ArrayList<Integer> sublist = new ArrayList<Integer>(numbers1.subList(2,6));
        System.out.println(sublist); //[3, 4, 5, 6]


        ArrayList<String> newList = new ArrayList<String>(Arrays.asList("naveen","tom","peter","steve","lisa","tom"));
        Object arr[] = newList.toArray();
        for(Object o: arr){
            System.out.println((String)o);
            //naveen
            //tom
            //peter
            //steve
            //lisa
            //tom
        }






    }
}
