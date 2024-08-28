package Array_Hashing;

public class FindNumbersEvenNumberDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            int digit = 0;
            while (n != 0) {
                digit++;
                n /= 10;
            }
            if (digit % 2 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[] {12,345,2,6,7896}));
    }
}
