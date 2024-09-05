package Array_Hashing;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length-1, mid = 0;
        while (l <= r) {
            mid = (l+r)/2;
            if (nums[mid]==target) return mid;
            else if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},7));
    }
}
