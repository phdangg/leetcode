package Array_Hashing;

public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] c1 = new int[1001];
        int[] c2 = new int[1001];
        for (int n : nums1) c1[n]++;
        for (int n : nums2) c2[n]++;
        int len = 0;
        for (int i = 0; i < c1.length; i++)
            if (c1[i] != 0 && c2[i] != 0) len += Math.min(c1[i],c2[i]);

        int[] ans = new int[len];
        int idx = 0;
        for (int i = 0; i < c1.length; i++)
            if (c1[i] != 0 && c2[i] != 0) {
                int occur = Math.min(c1[i],c2[i]);
                while (occur!=0) {
                    ans[idx++] = i;
                    occur--;
                }
            }
        return ans;

    }
}
