package DataStructure;

import java.util.Arrays;
import java.util.List;

public class Basic_Array {
    public static void main(String args[]){

        // 1, new
        int[] array = new int[]{3, 1, 2, 2};

        // 2, sort
        Arrays.sort(array); // sort in-place
        System.out.println("sorted array:");
        for(int a:array) System.out.println(a);

        // 3, convert
        List<Integer> converted = Arrays.asList(1, 2, 3);
        System.out.println(converted);

        // 4, 2-d array
        // 4.1 create
        int[][] array2D = new int[][]{{0,30},{5,10},{15,20}, {5, 9}};
        Arrays.sort(array2D, (a, b) -> {
            if(Integer.compare(a[0], b[0]) != 0){
                return Integer.compare(a[0], b[0]);
            }
            else{
                return Integer.compare(a[1], b[1]);
            }
        });

        for(int i = 0; i < array2D.length; i++){
            System.out.println("[[" + array2D[i][0] + "], [" + array2D[i][1] + "]]");
        }
    }
}
