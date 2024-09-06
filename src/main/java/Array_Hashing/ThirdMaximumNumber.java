package Array_Hashing;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        int[] tmp = new int[3];
        int max = Integer.MIN_VALUE;
        for (int j : nums) max = Math.max(max, j);
        tmp[0] = max;
        max = Integer.MIN_VALUE;
        for (int num : nums) if (num < tmp[0]) max = Math.max(max, num);
        tmp[1] = max;
        max = Integer.MIN_VALUE;
        boolean flg = false;
        for (int num : nums) if (num < tmp[1]) {
            max = Math.max(max, num);
            flg = true;
        }
        tmp[2] = max;
        return flg ? tmp[2] : tmp[0];
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{2,1}));
    }
}
