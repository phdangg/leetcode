package Array_Hashing;

import java.util.Arrays;

public class AverageofSmallestandLargestElements {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int r = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length / 2; i++){
            r = Math.min(r,nums[i] + nums[nums.length - 1 - i]);
        }
        return r / 2.0;
    }
}
