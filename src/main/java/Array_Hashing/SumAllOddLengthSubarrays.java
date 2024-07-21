package Array_Hashing;

public class SumAllOddLengthSubarrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int start = n - i;  // Number of subarrays starting at or before index i
            int end = i + 1;    // Number of subarrays ending at or after index i
            int total = start * end;  // Total number of subarrays that include arr[i]

            int oddSub = (total + 1) / 2;  // Number of odd length subarrays that include arr[i]

            sum += oddSub * arr[i];  // Contribution of arr[i] to the final sum
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[]{10,11,12}));
    }
}
