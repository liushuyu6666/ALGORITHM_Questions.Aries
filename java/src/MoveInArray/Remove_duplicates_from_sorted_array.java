package MoveInArray;

public class Remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums){
        if(nums.length < 1) return 0;
        if(nums.length < 2) return 1;
        int i = 1, j = 0, threshold = nums[0];
        while(i < nums.length && nums[i] > nums[i-1]){
            i++;
        }
        j = i;
        while(j < nums.length){
            if(nums[j] > nums[i-1]){
                nums[i] = nums[j];
                i++;
            }
            else{
                j++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        Remove_duplicates_from_sorted_array s = new Remove_duplicates_from_sorted_array();
        int size = s.removeDuplicates(nums);
        System.out.println(size);
    }
}

