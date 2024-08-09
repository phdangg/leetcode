package Array_Hashing;

public class SumUniqueElements {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] c = new int[101];
        for (int n : nums) c[n]++;
        for (int i = 0; i < c.length; i++)
            if (c[i]==1) sum+=i;
        return sum;
    }
}
