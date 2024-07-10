package Array_Hashing;

import java.util.Arrays;

public class SumofAllSubsetXORTotals_1863 {

    public static int subsetXORSum(int[] nums) {
        return dfs(nums,0,0);
    }
    public static int dfs(int[] nums, int i, int total){
        if (i == nums.length) return total;
        return dfs(nums, i + 1, total ^ nums[i]) + dfs(nums, i + 1, total);
    }

    public static void main(String[] args) {
        System.out.println(subsetXORSum(new int[] {3,4,5,6,7,8}));
    }
}
