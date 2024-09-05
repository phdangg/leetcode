package Array_Hashing;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[nums1.length];
        System.arraycopy(nums1, 0, tmp, 0, tmp.length);
        int idx1 = 0, idx2 = 0, idx = 0;
        while (idx1 < m && idx2 < n) {
            if (tmp[idx1] < nums2[idx2])
                nums1[idx++] = tmp[idx1++];
            else nums1[idx++] = nums2[idx2++];
        }
        while (idx1 < m) nums1[idx++] = tmp[idx1++];
        while (idx2 < n) nums1[idx++] = nums2[idx2++];
    }
}
