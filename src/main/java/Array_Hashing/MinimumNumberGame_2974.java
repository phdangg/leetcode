package Array_Hashing;

import java.util.Arrays;

public class MinimumNumberGame_2974 {
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i+=2){
            int Alice = nums[i], Bob = nums[i+1];
            result[i] = Bob;
            result[i+1] = Alice;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numberGame(new int[]{5,4,2,3}));
    }
}
