package Array_Hashing;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = -1;
        for (int n : nums) {
            if (count==0) {
                candidate = n;
                count++;
            }
            else {
                if (n == candidate) count++;
                else count--;
            }
        }
        count = 0;
        for (int n : nums) {
            if (candidate == n) count++;
        }
        if (count > nums.length / 2) return candidate;
        return -1;
    }
}
