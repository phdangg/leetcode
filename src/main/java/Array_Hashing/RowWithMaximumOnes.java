package Array_Hashing;

public class RowWithMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        int maxOne = 0;
        for (int i = 0; i < mat.length; i++) {
            int countOne = 0;
            for (int n : mat[i]) if (n==1) countOne++;
            if (countOne > maxOne) {
                ans[0] = i;
                ans[1] = countOne;
                maxOne = countOne;
            }
        }
        return ans;

    }
}
