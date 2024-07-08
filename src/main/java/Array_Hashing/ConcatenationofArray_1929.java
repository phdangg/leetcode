package Array_Hashing;

import java.util.Arrays;

public class ConcatenationofArray_1929 {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[] {1,3,2,1})));
    }
}
