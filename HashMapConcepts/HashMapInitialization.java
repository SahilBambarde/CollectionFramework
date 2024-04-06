package HashMapConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.AbstractMap;

public class HashMapInitialization {

    public static HashMap<String,Integer> marksMap;

    static{
        marksMap=new HashMap<>();
        marksMap.put("a",100);
        marksMap.put("b",200);
    }
    public static void main(String[] args) {
        //1. using HashMap class
        HashMap<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();

        //2.static way: static hashMap;
        System.out.println(HashMapInitialization.marksMap.get("a")); //100

        //3.immutable map with only one single entry:
        Map<Integer,String> map3 = Collections.singletonMap(100,"a");
        System.out.println(map3.get(100)); //a
        //map3.put(200,"b"); // java.lang.UnsupportedOperationException

        //4. JDK 8:
        Map<String,String> map4=Stream.of(new String[][]{
                {"tom","t"},
                {"sahil","s"},
        }).collect(Collectors.toMap(data->data[0], data->data[1]));
        System.out.println(map4.get("tom")); //t
        map4.put("liza","l");
        System.out.println(map4.get("liza")); //l

        //using SimpleEntry:
        Map<String,String> map5 =Stream.of(
                new AbstractMap.SimpleEntry<>("Naveen","n"),
                new AbstractMap.SimpleEntry<>("Sahil","s")
        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map5.get("Naveen")); //n
        map5.put("liza","l");
        System.out.println(map5.get("liza")); //l

        //JDK1.9
        //empty map:
        Map<String,String> emptyMap = Map.of();
        //emptyMap.put("sahil","s"); //java.lang.UnsupportedOperationException

       //singletonMap
        Map<String,String> singletonMap = Map.of("k1","v1");
        System.out.println(singletonMap.get("k1")); //v1
        //singletonMap.put("k2","v2"); //java.lang.UnsupportedOperationException

        //multi Values Map:
        //max 10 pairs can be stored:
        Map<String,String> multiMap = Map.of("k1","v1","k2","v2","k3","v3","k4","v4");
        System.out.println(multiMap.get("k3"));


        //ofEntries method:
        //no limitations on pairs(key-values)
        //Immutable Maps:
        Map<String,Integer> map7 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("a",100),
                new AbstractMap.SimpleEntry<>("b",200)
        );
        System.out.println(map7.get("b")); //200
        //map7.put("d",400); //java.lang.UnsupportedOperationException

    }
}
