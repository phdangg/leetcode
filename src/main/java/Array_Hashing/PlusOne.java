package Array_Hashing;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        digits[n]++;
        while (digits[n] / 10 != 0) {
            digits[n] /= 10;
            n--;
            if (n >= 0) digits[n]++;
            else break;
        }
        if (n == -1) {
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            System.arraycopy(digits, 0, ans, 1, digits.length);
            return ans;
        }
        return digits;
    }
}
