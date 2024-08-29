package Array_Hashing;

public class NRepeatedElementSize2NArray {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        int[] c = new int[100001];
        for (int num : nums) c[num]++;
        for (int i = 0; i < c.length; i++) {
            if (c[i]==n) return i;
        }
        return 0;
    }
}
