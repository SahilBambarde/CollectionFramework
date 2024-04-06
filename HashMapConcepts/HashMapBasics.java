package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {
    public static void main(String...a){

        //no ordereing - no indexing
        //stores value --- key--value<k,v>
        //key can not be duplicate
        //values can be duplicate
        // can store many null VALUES but only one null KEY
        //HashMap is not thread-safe/ synchronized

        HashMap<String, String> captialMap = new HashMap<String, String>();
        captialMap.put("India","new delhi");
        captialMap.put("USA","washinton");
        captialMap.put("UK","london");

        System.out.println(captialMap.get("USA")); // washinton


        captialMap.put("UK","london11");
        System.out.println(captialMap.get("UK")); //london11


        captialMap.put(null,"berlin");
        captialMap.put(null,"LA");
        System.out.println(captialMap.get(null)); //LA


        captialMap.put("Russia",null);
        captialMap.put("France", null);
        System.out.println(captialMap.get("Russia")); //null
        System.out.println(captialMap.get("Frace")); //null


        //Iterator: over the set (pair) :by using keySet()
        Iterator<String> it = captialMap.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = captialMap.get(key);
            System.out.println("key= "+key+" value= "+value);
        }

        System.out.println();
        captialMap.remove("France");
        //Iterator: over the set(pair): by using entrySet
        Iterator<Entry<String,String>> it1= captialMap.entrySet().iterator();
        while(it.hasNext()){
            Entry<String,String> entry =it1.next();
            System.out.println("key = "+entry.getKey() + " and value = "+ entry.getValue());
        }

        //iterate hashmap using java8 for each and lambda:
        captialMap.forEach((k,v) -> System.out.println(k + " " +v));



    }
}
