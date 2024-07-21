package Array_Hashing;

public class MaximumSumWithExactlyKElements {
    public int maximizeSum(int[] nums, int k) {
        int m = 0, sum = 0;
        for (int n : nums) m = Math.max(m,n);
        while (k!=0){
            sum += m;
            m++;k--;
        }
        return sum;
    }
}
