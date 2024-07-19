package Array_Hashing;

import java.util.Arrays;

public class differenceOfSum {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        for (int n : nums) elementSum+=n;
        int digitSum = 0;
        for (int n : nums){
            while (n != 0){
                digitSum += n % 10;
                n /= 10;
            }
        }
        return Math.abs(elementSum-digitSum);
    }
}
