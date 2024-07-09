package Array_Hashing;

import java.util.Arrays;

public class ShuffletheArray_1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int xIndex = 0, yIndex = n;
        for (int i = 0; i < ans.length; i++){
            if (i % 2 == 0) {
                ans[i] = nums[xIndex];
                xIndex++;
            }
            else {
                ans[i] = nums[yIndex];
                yIndex++;
            }
        }
        return ans;
    }
    public int[] shuffle2(int[] nums, int n) {
        int[] arr = new int[2*n];

        for(int i=0; i<n; i++){
            arr[2 * i] = nums[i];         // Place xi at even indices
            arr[2 * i + 1] = nums[i + n]; // Place yi at odd indices
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7},3)));
    }
}
