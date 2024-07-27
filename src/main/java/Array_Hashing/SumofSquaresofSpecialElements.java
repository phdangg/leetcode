package Array_Hashing;

public class SumofSquaresofSpecialElements {
    public static int sumOfSquares(int[] nums) {
        int sum = 0;
        int i = 1;
        for (int n : nums){
            if (nums.length % i == 0) sum += n*n;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares(new int[]{1,2,3,4}));
    }
}
