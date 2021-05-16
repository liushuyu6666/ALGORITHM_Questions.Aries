package DataStructure;

import java.util.*;

public class Basic_ArrayList {
    public static void main(String args[]){

        // 1, create
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 4, 7, 8, 9);
        System.out.println(list);

        Basic_Create basic_create = new Basic_Create();
        List<Integer> list1 = new ArrayList<>(basic_create.createLinkedList());
        List<Integer> list2 = new ArrayList<>(basic_create.createSet());
        List<Integer> list3 = new ArrayList<>(basic_create.createHashMap().values());
        List<Integer> list4 = new ArrayList<>(basic_create.createHashMap().keySet());
        List<Integer> list5 = new ArrayList<>(basic_create.createQueue());
        List<Integer> list6 = new ArrayList<>(basic_create.createStack());

        List<Integer> list7 = new ArrayList<>();
        list7.addAll(basic_create.createLinkedList());

        // 2, check
        System.out.println(list1.size());
        System.out.println(list2.contains(3));
        System.out.println(list3.isEmpty());

        // 3 iterator
        Iterator<Integer> iter = list.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        // 2, subList
        List<Integer> subList = list.subList(0, 3);
        System.out.println(subList);

        // 3, add with index
        // list can't add since it generate by Arrays.asList
//        list.add(1); // UnsupportedOperationException
        list1.add(10);
        list7.add(10);
        System.out.println(list);

        // 4.1 create nested ArrayList
        int[][] arr = new int[][]{{1, 1}, {2, 1}, {2, 2}, {3, 4}};
        List<int[]> arrList = new ArrayList<>();
        Collections.addAll(arrList, arr);

        // 4.2 contains, pay attention, the contains will check the pointer
        int[] target = arr[0];
        System.out.println(arrList.contains(target));


    }
}
