package Array_Hashing;

import java.util.Arrays;

public class MinimumOperationstoExceedThresholdValueI {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < k) count++;
        }
        return count;
    }
}
