package Array_Hashing;

public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        int[] c = new int[101];
        for (int n: nums) c[n]++;
        int max = 1;
        int sum = 0;
        for (int n : c) max =Math.max(max,n);
        for (int i = 0; i < c.length; i++)
            if (c[i]==max) sum+=max;
        return sum;
    }
}
