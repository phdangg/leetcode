package Array_Hashing;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        final int N = 3*100000;
        int[] c = new int[2*N+1];
        for (int n : nums) c[n+N]++;
        for (int i = 0; i < c.length; i++)
            if (c[i] == 1) return i-N;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{-1}));
    }
}
