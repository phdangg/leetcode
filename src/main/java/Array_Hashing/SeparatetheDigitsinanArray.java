package Array_Hashing;

public class SeparatetheDigitsinanArray {
    public int[] separateDigits(int[] nums) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int n : nums) stringBuilder.append(n);
        int[] ans = new int[stringBuilder.length()];
        String number = stringBuilder.toString();
        for (int i = 0; i < ans.length; i++) {
            ans[i] = number.charAt(i) - '0';
        }
        return ans;
    }
}
