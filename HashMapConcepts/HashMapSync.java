package HashMapConcepts;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {
    public static void main(String[] a){
        //HashMap: Not Thread-Safe; Can have one null key and multiple null values;
        //HashTable: Thread-safe; slow performance, null key and null values not allowed;
        //SynchronizedMap: Thread-safe; slow performance, null key and multiple null values are allowed
        //ConcurrentHashMap: Thread-Safe; Thread-Safe; Null key and values are not allowed; it DOesnot throw ConcurrentModificationExceptoon


        Map<Integer,String> map1= new HashMap<Integer,String>();
        map1.put(1,"a");
        map1.put(2,"b");

        //create synchronized HashMap:
        Map<Integer,String> syncMap = Collections.synchronizedMap(map1);
        System.out.println(syncMap); //{1=a, 2=b}

        //ConcurrentHashMap:
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("a","aa");
        concurrentHashMap.put("b","bb");
        System.out.println(concurrentHashMap.get("a")); //aa

    }
}
