package Array_Hashing;

public class RelativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] c = new int[1001];
        int[] ans = new int[arr1.length];
        for (int n : arr1) c[n]++;
        int idx = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (c[arr2[i]] > 0) {
                ans[idx++] = arr2[i];
                c[arr2[i]]--;
            }
        }
        for (int i = 0; i < c.length; i++) {
            while (c[i] > 0) {
                ans[idx++] = i;
                c[i]--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[] {2,1,4,3,9,6}));
    }
}
