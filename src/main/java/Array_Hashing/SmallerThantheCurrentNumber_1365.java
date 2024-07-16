package Array_Hashing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallerThantheCurrentNumber_1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int max = Arrays.stream(nums).max().getAsInt();
        int[] c = new int[max+1];
        for (int n : nums)
            c[n]++;
        System.out.println(Arrays.toString(c));
        int[] b = new int[max+1];
        System.arraycopy(c, 0, b, 0, b.length);
        for (int i=1 ;i < c.length; i++)
            c[i] += c[i-1];
        System.out.println(Arrays.toString(c));
        for (int i = 0; i < b.length; i++)
            b[i] = c[i] - b[i];
        System.out.println(Arrays.toString(b));
        for (int i=0;i < result.length;i++)
            result[i] = b[nums[i]];
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        smallerNumbersThanCurrent(new int[] {5,0,10,0,10,6});
    }
}
