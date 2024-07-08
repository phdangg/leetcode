package Array_Hashing;

public class NumberofGoodPairs {
    static int binomi(int n, int k) {
        if (n < k) return 0;
        if ((n == k) || (k == 0))
            return 1;
        else
            return binomi(n - 1, k) + binomi(n - 1, k - 1);
    }
    public static int numIdenticalPairs(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int n : nums)
            if (n > max) max = n;

        int[] c = new int[max+1];
        for (int num : nums) c[num]++;

        int result = 0;
        for (int n : c) {
            result += binomi(n, 2);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[] {1,2,3,1,1,3}));
    }
}
