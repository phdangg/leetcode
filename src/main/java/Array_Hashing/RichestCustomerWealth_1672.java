package Array_Hashing;

import java.util.Arrays;

public class RichestCustomerWealth_1672 {
    public static int maximumWealth(int[][] accounts) {
        int max = Arrays.stream(accounts[0]).sum();
        for (int i = 1; i < accounts.length; i++)
            max = Math.max(max,Arrays.stream(accounts[i]).sum());
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
    }
}
