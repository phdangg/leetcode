package Array_Hashing;

public class ArrayPartition {
    public static int arrayPairSum(int[] nums) {
        int[] c = new int[2*10000 + 1];
        for (int n : nums) c[n+10000]++;
        for (int i = 1; i < c.length; i++) c[i] += c[i-1];
        int[] b = new int[nums.length];
        for (int i = 0; i < b.length; i++) {
            b[c[nums[i]+10000]-1] = nums[i];
            c[nums[i]+10000]--;
        }
        int sum = 0;
        for (int i = 0; i < b.length; i += 2) sum += b[i];
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[] {6,2,6,5,1,2}));
    }
}
