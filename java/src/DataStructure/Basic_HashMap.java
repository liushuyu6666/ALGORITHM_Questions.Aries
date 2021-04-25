package DataStructure;

import java.util.*;

public class Basic_HashMap {

    public static void main(String args[]){

        // 1, new
        Map<Integer, Integer> map = new HashMap<>();

        // 2, add
        map.put(1, -1);
        map.put(2, -2);
        map.put(3, -3);
        map.put(4, -3);

        // 3, get
        System.out.println("-----------get--------------");
        System.out.println(map.get(1));

        // 4, getOrDefault
        System.out.println("-----------getOrDefault--------------");
        System.out.println(map.getOrDefault(6, null));

        // 5, keySet
        System.out.println("-----------keySet--------------");
        System.out.println(map.keySet());

        // 6, entrySet
        System.out.println("-----------map.entrySet--------------");
        Set<Map.Entry> mapEntries = new HashSet<>(map.entrySet());
        System.out.println(mapEntries);
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            System.out.println(m);
        }

        // 7, containsKey
        System.out.println("-----------containsKey--------------");
        System.out.println(map.containsKey(1));

        // 8, containsValue
        System.out.println("-----------containsValue--------------");
        System.out.println(map.containsValue(5));

        // 9, keySet
        System.out.println("-----------keySet--------------");
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);

        // 10, values
        System.out.println("-----------values--------------");
        List<Integer> intList = new ArrayList<>(map.values());
        System.out.println(intList);

        // 11, size
        System.out.println("-----------size--------------");
        System.out.println(map.size());
    }
}
