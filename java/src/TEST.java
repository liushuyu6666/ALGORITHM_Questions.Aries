import java.util.*;

public class TEST {
    public void hashMapTest(){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, -1);
        map.put(2, -2);
        map.put(3, -3);
        map.put(4, -3);

        System.out.println("-----------get--------------");
        System.out.println(map.get(1));

        System.out.println("-----------getOrDefault--------------");
        System.out.println(map.getOrDefault(6, null));

        System.out.println("-----------keySet--------------");
        System.out.println(map.keySet());

        System.out.println("-----------map.entrySet--------------");
        Set<Map.Entry> mapEntries = new HashSet<>(map.entrySet());
        System.out.println(mapEntries);
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            System.out.println(m);
        }

        System.out.println("-----------containsKey--------------");
        System.out.println(map.containsKey(1));

        System.out.println("-----------containsValue--------------");
        System.out.println(map.containsValue(5));

        System.out.println("-----------keySet--------------");
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);

        System.out.println("-----------values--------------");
        List<Integer> intList = new ArrayList<>(map.values());
        System.out.println(intList);

        System.out.println("-----------size--------------");
        System.out.println(map.size());
    }
    public static void main(String args[]){
        TEST test = new TEST();

        test.hashMapTest();
    }
}
