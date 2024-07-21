package Array_Hashing;

public class FindtheIntegerAddedtoArrayI {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1 = 0, sum2 = 0;
        for (int n : nums1) sum1+=n;
        for (int n : nums2) sum2+=n;
        return (sum2 - sum1) / nums1.length;
    }
}
