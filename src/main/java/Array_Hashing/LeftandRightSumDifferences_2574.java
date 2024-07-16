package Array_Hashing;

import java.util.Arrays;

public class LeftandRightSumDifferences_2574 {
    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < leftSum.length; i++){
            leftSum[i] += sum;
            sum += nums[i];
        }
        sum = 0;
        for (int i = rightSum.length - 1; i >= 0; i--){
            rightSum[i] += sum;
            sum += nums[i];
        }
        for (int i = 0; i < result.length; i++)
            result[i] = Math.abs(leftSum[i]-rightSum[i]);
        return result;
    }

    public static void main(String[] args) {
        leftRightDifference(new int[] {10,4,8,3});
    }
}
