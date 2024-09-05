package Array_Hashing;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; Math.abs(i-j) <= k; j++)
                if (nums[i]==nums[j]) return true;
        }
        return false;
    }
}
