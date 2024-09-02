package Array_Hashing;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public static boolean binarySearch(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l+r)/2;
            if (arr[mid]==x) return true;
            else if (arr[mid] > x) r = mid - 1;
            else l = mid + 1;
        }
        return false;
    }
    public static int findMaxK(int[] nums) {
        int[] c = new int[2001];
        for (int n : nums) c[n+1000]++;
        for (int i = 1; i < c.length; i++) c[i] += c[i-1];
        int[] b = new int[nums.length];
        for (int i = 0; i < b.length; i++) {
            b[c[nums[i]+1000]-1] = nums[i];
            c[nums[i]+1000]--;
        }
        for (int i = b.length - 1; i >= 0; i--) {
            if (binarySearch(b,-b[i])) return b[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findMaxK(new int[]{-1,10,6,7,-7,1}));
    }
}
