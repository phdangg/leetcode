package Array_Hashing;

import java.util.Arrays;

public class MaximumNumberPairsArray {
    public static int[] numberOfPairs(int[] nums) {
        if (nums.length == 1) return new int[] {0,1};
        int[] c = new int[101];
        for (int n : nums) c[n]++;
        int[] ans = new int[2];
        for (int i = 0; i < c.length; i++) {
            while (c[i] - 2 >= 0) {
                ans[0]++;
                c[i] -= 2;
            }
        }
        for (int n : c) ans[1] += n;
        return ans;
    }

    public static void main(String[] args) {
        int[] input = new int[]{5,12,53,22,7,59,41,54,71,24,91,74,62,47,20,14,73,11,82,2,15,38,38,20,57,70,86,93,38,75,94,19,36,40,28,6,35,86,38,94,4,90,18,87,24,22};
        System.out.println(Arrays.toString(numberOfPairs(input)));
    }
}
