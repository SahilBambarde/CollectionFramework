package HashMapConcepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class HashMapCompare {
    public static void main(String... a){
        HashMap<Integer, String> map1= new HashMap<Integer,String>();
        map1.put(1,"a");
        map1.put(2,"b");
        map1.put(3,"c");

        HashMap<Integer,String> map2=new HashMap<Integer,String>();
        map2.put(3,"c");
        map2.put(1,"a");
        map2.put(2,"b");

        HashMap<Integer,String> map3 = new HashMap<Integer,String>();
        map3.put(1,"a");
        map3.put(2,"b");
        map3.put(3,"c");
        map3.put(3,"d");

        System.out.println(map1.equals(map2)); //true
        System.out.println(map1.equals(map3)); //false

        //2. compare hashmaps for the same keys: keySet():
        System.out.println(map1.keySet().equals(map2.keySet())); //true
        System.out.println(map1.keySet().equals(map3.keySet())); //true

        //find out the extra keys:
        HashMap<Integer,String> map4 = new HashMap<Integer,String>();
        map4.put(1,"a");
        map4.put(2,"b");
        map4.put(3,"c");
        map4.put(4,"d");
        //combine the keys from both the maps: using HashSet:
        HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
        combineKeys.addAll(map4.keySet());
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys); //[4]

        //4. compare maps by values:
        HashMap<Integer,String> map5 = new HashMap<>();
        map5.put(1,"a");
        map5.put(2,"b");
        map5.put(3,"c");
        HashMap<Integer,String> map6 = new HashMap<>();
        map6.put(1,"a");
        map6.put(2,"b");
        map6.put(3,"c");
        HashMap<Integer,String> map7 = new HashMap<>();
        map7.put(1,"a");
        map7.put(2,"b");
        map7.put(3,"c");
        map7.put(4,"c");

        //1. duplicates are not allowed:
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values()))); //true
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values()))); //false

        //2. duplicate are allowed: using HashSet
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));//true
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));//true



    }
}
