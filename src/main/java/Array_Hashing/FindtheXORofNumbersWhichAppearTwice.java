package Array_Hashing;

public class FindtheXORofNumbersWhichAppearTwice {
    public static int duplicateNumbersXOR(int[] nums) {
        int[] cnt = new int[51];
        for (int n : nums) cnt[n]++;
        int ans = 0;
        for (int i = 0; i < cnt.length; i++){
            if (cnt[i] == 2) ans = i ^ ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(duplicateNumbersXOR(new int[]{1,2,2,1}));
    }
}
