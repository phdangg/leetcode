package Array_Hashing;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == val) nums[i] = -1;
        int idx = 0;
        for (int n : nums)
            if (n!=-1) nums[idx++] = n;
        return idx;
    }
}
