package Array_Hashing;

public class FindMinimumOperations_3190 {
    public static int minimumOperations(int[] nums) {
        int result = 0;
        for (int n : nums){
            int add = n, sub = n;
            while (add % 3 != 0) add++;
            while (sub % 3 != 0) sub--;
            result += Math.min(add-n,n-sub);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{3,6,9}));
    }
}
