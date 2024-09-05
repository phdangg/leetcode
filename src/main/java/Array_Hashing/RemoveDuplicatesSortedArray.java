package Array_Hashing;

public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int k = 1;
        for(int i = 1; i < nums.length; i++)
            if(nums[i] != nums[i-1]) nums[k++] = nums[i];
        return k;
    }
}
