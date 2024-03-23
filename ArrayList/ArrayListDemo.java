package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //default class in java
        //dynamic array

        int i[] = new int[4];
        //this can store max 4 elemtns

        i[0]=100;
        System.out.println(i[0]);
        //100

        System.out.println(i[3]);
        //0
        //Default value is 0

        //System.out.println(i[4]);
        //java.lang.ArrayIndexOutOfBoundException: Index 4 out of bounds for length 4

        //i[-1]=200;
        //java.lang.ArrayIndexOutofBoundsException: Index -1 out of bounds for length 4

        //default generics
        ArrayList ar = new ArrayList();
        //this is in java.utils.ArrayList
        //Arraylist if class
        //Here ArrayList is of row type, therefore any type of values for be used
        ar.add(100);
        ar.add(200);
        ar.add("testing");
        ar.add('t');
        ar.add(12.33);
        ar.add(true);

        System.out.println(ar);
        //[100, 200, testing, t, 12.33, true]
        //Any type of data can be stored but java doesnt like it

        ArrayList<Object> ar1= new ArrayList<>();
        //Object is class
        ar1.add(100);
        ar1.add(200);
        ar1.add("testing");
        ar1.add('t');
        ar1.add(12.33);
        ar1.add(true);

        System.out.println(ar1);
        //[100, 200, testing, t, 12.33, true]

        System.out.println(ar1.get(2));
        //testing

        //System.out.println(ar.get(6));
        //java.lang.IndexOutofBOundsException: Index 6 out of bounds for length 6

        //System.out.println(ar.get(-1));
        //java.lang.IndexOutofBOundsException: INdex -1 out of bounds for length 6

        System.out.println(ar.size());

        System.out.println("Lower Index " + 0);
        System.out.println("Higher Index " +(ar1.size()-1));

        ar1.add(400);
        ar1.add(500);

        System.out.println(ar1.size());
        //8
        //dyanmic nature



    }
}
