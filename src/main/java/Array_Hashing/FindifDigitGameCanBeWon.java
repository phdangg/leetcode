package Array_Hashing;

public class FindifDigitGameCanBeWon {
    public boolean canAliceWin(int[] nums) {
        int sum = 0;
        for (int n: nums){
            if (n / 10 == 0) sum+=n;
            else sum-=n;
        }
        return sum == 0;
    }
}
