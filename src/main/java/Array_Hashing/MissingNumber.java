package Array_Hashing;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int[] c = new int[nums.length+1];
        for (int n : nums) c[n]++;
        for (int i = 0; i < c.length; i++)
            if (c[i]!=1) return i;
        return -1;
    }
}
