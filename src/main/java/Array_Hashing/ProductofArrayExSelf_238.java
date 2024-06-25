package Array_Hashing;

import java.util.Arrays;

public class ProductofArrayExSelf_238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--)
            suffix[i] = suffix[i+1] * nums[i+1];
        int[] output = new int[nums.length];
        for (int i = 0; i < output.length; i++)
            output[i] = prefix[i]*suffix[i];
        return output;
    }
    public static int[] productExceptSelf2(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        for (int i = 1; i < output.length; i++)
            output[i] = output[i-1]*nums[i-1];
        int r = 1;
        for (int i = nums.length - 1; i > 0; i--){
            output[i] *= r;
            r *= nums[i];
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }
}
