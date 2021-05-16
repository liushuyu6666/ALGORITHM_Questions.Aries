package ZZTrashBin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Intersection_of_two_arrays_II {
    public int[] intersect(int[] nums1, int[] nums2){
        if(nums1.length > nums2.length) return intersect(nums2, nums1);

        int[] intersection = new int[nums1.length];
        int count, index = 0;
        Map<Integer, Integer> map = new HashMap<>(nums1.length);
        for(int x:nums1){
            count = map.getOrDefault(x, 0) + 1;
            map.put(x, count);
        }
        for(int x:nums2){
            if(map.containsKey(x)){
                intersection[index] = x;
                index++;
                count = map.get(x) - 1;
                if(count == 0){
                    map.remove(x);
                }
                else{
                    map.put(x, count);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }

    public static void main(String args[]){
        int[] nums1 = {1, 1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 4, 4, 5, 6, 7};
        Intersection_of_two_arrays_II s = new Intersection_of_two_arrays_II();
        int[] solution = s.intersect(nums1, nums2);
        for(int x:solution) System.out.println(x);
    }
}
