package Array_Hashing;

import java.util.Arrays;

public class BuildArrayfromPermutation_1920 {
    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++)
            result[i] = nums[nums[i]];
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new int[] {5,0,1,2,3,4})));
    }
}
