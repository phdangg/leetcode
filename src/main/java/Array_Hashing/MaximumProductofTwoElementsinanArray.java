package Array_Hashing;

public class MaximumProductofTwoElementsinanArray {
    public int maxProduct(int[] nums) {
        int largest = Integer.MIN_VALUE, idxL = -1;
        int secondL = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > largest){
                largest = nums[i]; idxL = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondL && i != idxL) {
                secondL = nums[i];
            }
        }
        return (largest-1)*(secondL-1);
    }
}
