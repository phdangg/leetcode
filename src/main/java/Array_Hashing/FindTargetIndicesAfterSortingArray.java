package Array_Hashing;

import java.util.ArrayList;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static List<Integer> targetIndices(int[] nums, int target) {
        int[] c = new int[101];
        for (int n : nums) c[n]++;
        for (int i = 1; i < c.length; i++) c[i] += c[i-1];
        int[] b = new int[nums.length];
        for (int i = 0; i < b.length; i++) {
            b[c[nums[i]]-1] = nums[i];
            c[nums[i]]--;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if (b[i] == target) ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(targetIndices(new int[]{1,2,5,2,3} , 2));
    }
}
