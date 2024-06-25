package Array_Hashing;

import java.util.Arrays;

public class ProductofArrayExSelf_238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        for (int i = 1; i < nums.length; i++)
            output[i] = output[i-1]*nums[i-1];

        for (int i = nums.length - 2; i >=0; i--)
            output[i] = output[i+1]*nums[i+1];
        return output;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }
}
