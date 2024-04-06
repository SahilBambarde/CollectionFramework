package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class HashMapToArrayList {

    public static void main(String[] args) {
        HashMap<String,Integer> companyMap = new HashMap<>();
        companyMap.put("google",10);
        companyMap.put("walmart",20);
        companyMap.put("amazon",30);
        companyMap.put("meta",40);

        System.out.println("company map size:"+companyMap.size());

        Iterator it = companyMap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + " = "+ pairs.getValue());
        }

        //convert HashMap to ArrayList:
        List<String> companyNamesList = new ArrayList<>(companyMap.keySet());
        System.out.println(companyNamesList);
        for(String i: companyNamesList){
            System.out.println(i);
        }

        System.out.println("----------------------");
        //convert HashMap values into ArrayList:
        List<Integer> companyValuesList = new ArrayList<Integer>(companyMap.values());
        for(int i: companyValuesList){
            System.out.println(i);
        }

        System.out.println("-----------------");
        //printing key and values using lambda fucntion (for hashMap)
        companyMap.forEach((k,v)-> System.out.println("key= "+k+" value="+v));
    }

}
