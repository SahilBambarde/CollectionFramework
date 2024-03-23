package ArrayList;

import java.util.ArrayList;

public class VirtualCapacity {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<>();
        //by deault it will create arraylist of 10 equal parts from 0 to 9
        //this is virtual capacity

        //physical size is 0 for now
        //but virtaul capacity is 10

        System.out.println(ar.size());
        //0
        //as physical capacity of this arrayList is 0

        ar.add(100);
        System.out.println(ar);
        //physical capacity is 1 now
        //virtual capacity is 9 here

        ar.add(200);
        ar.add(300);
        ar.add(400);
        System.out.println(ar.size());
        //physical capacity is 4
        //virtual capacity is 6 here

        ArrayList<Object> ar1 = new ArrayList<>(20);
        //virtual capacity is 20 here
        //physical capacity is 0

        ar1.add(100);
        //physical capacity is 1
        //virtual capacity is 19




    }

}
