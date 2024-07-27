package Array_Hashing;

import java.util.Arrays;

public class MinimumOperationstoMaketheArrayIncreasing {
    public static int minOperations(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++){
            if(nums[i]<=nums[i-1]){
                count+=(nums[i-1]-nums[i]+1);
                nums[i]=nums[i-1]+1;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{1,5,2,4,1}));
    }
}
