package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Basic_ArrayList {
    public static void main(String args[]){

        // 1, new
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(list);

        // 2, subList
        List<Integer> subList = list.subList(0, 3);
        System.out.println(subList);

        // 3.1 create nested ArrayList
        int[][] arr = new int[][]{{1, 1}, {2, 1}, {2, 2}, {3, 4}};
        List<int[]> arrList = new ArrayList<>();
        Collections.addAll(arrList, arr);

        // 3.2 contains, pay attention, the contains will check the pointer
        int[] target = arr[0];
        System.out.println(arrList.contains(target));
    }
}
