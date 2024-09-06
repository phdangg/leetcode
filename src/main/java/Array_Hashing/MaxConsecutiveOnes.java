package Array_Hashing;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int n : nums) {
            if (n==1) count++;
            else {
                max = Math.max(count,max);
                count = 0;
            }
        }
        return Math.max(max,count);
    }

    public static void main(String[] args) {
        findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});
    }
}
