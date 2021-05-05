package DataStructure;

import java.util.*;

public class Basic_ArrayList {
    public static void main(String args[]){

        // 1,1 new
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 4, 7, 8, 9);
        System.out.println(list);

        // 1.2 copy or new
        List<Integer> newList = new ArrayList<>(list);

        // 2, subList
        List<Integer> subList = list.subList(0, 3);
        System.out.println(subList);

        // 3, add with index
        // list can't add since it generate by Arrays.asList
//        list.add(1); // UnsupportedOperationException
        newList.add(9, 10);
        System.out.println(newList);

        // 4.1 create nested ArrayList
        int[][] arr = new int[][]{{1, 1}, {2, 1}, {2, 2}, {3, 4}};
        List<int[]> arrList = new ArrayList<>();
        Collections.addAll(arrList, arr);

        // 4.2 contains, pay attention, the contains will check the pointer
        int[] target = arr[0];
        System.out.println(arrList.contains(target));

        // 5 ArrayList to Set
        Set<Integer> set = new HashSet<>(newList);
        System.out.println(set);

    }
}
