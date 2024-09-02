package Array_Hashing;

public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] c = new int[1001];
        int len = 0;
        for (int n : nums1) c[n] = 1;
        for (int n : nums2) if (c[n] == 1) c[n]++;
        for (int n : c) if (n > 1) len++;
        int[] ans = new int[len];
        int idx = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] > 1) ans[idx++] = i;
        }
        return ans;

    }
}
