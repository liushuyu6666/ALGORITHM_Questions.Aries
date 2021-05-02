package Rotate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rotate_Array {
    public void rotate(int[] nums, int k){
        k = k % nums.length;
        int count = 0;
        for(int i = 0; count < nums.length; i++){
            int n = 1, currPos = i, nextPos = (currPos + k) % nums.length, prev = nums[currPos], temp;
            while(nextPos != i){
                temp = nums[nextPos];
                nums[nextPos] = prev;
                prev = temp;
                currPos = nextPos;
                nextPos = (currPos + k) % nums.length;
                count++;
            }
            nums[nextPos] = prev;
            count++;
        }
    }

    public static void main(String args[]){
        int nums1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10, 11};
        Rotate_Array s = new Rotate_Array();
        s.rotate(nums1, 3);

        List<Integer> ans = new ArrayList<>();
        for(int n : nums1){
            ans.add(n);
        }
        System.out.println(ans);

    }
}
