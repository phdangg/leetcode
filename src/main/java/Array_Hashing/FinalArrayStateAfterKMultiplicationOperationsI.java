package Array_Hashing;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FinalArrayStateAfterKMultiplicationOperationsI {
    public static void heapify(int[] arr, int i, int n) {
        int left = 2*i+1;
        int right = 2*i+2;
        int min = i;
        if (left < n && arr[min] > arr[left]) min = left;
        if (right < n && arr[min] > arr[right]) min = right;
        if (min != i) {
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
            heapify(arr,min,n);
        }
    }
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] heap = new int[nums.length];
        System.arraycopy(nums,0,heap,0,heap.length);
        for (int i = 0; i < k; i++) {
            for (int x = nums.length / 2 - 1; x >=0 ; x--)
                heapify(heap,x,heap.length);
            for (int j = 0; j < nums.length; j++){
                if (nums[j] == heap[0]) {nums[j]*=multiplier; break;}}
            heap[0] *= multiplier;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] input = new int[]{4,5,2,5,3};
        System.out.println(Arrays.toString(getFinalState(input,3,2)));
    }
}
