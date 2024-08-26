package Array_Hashing;

import java.util.Arrays;

public class DeleteGreatestValueinEachRow {
    public static int deleteGreatestValue(int[][] grid) {
        for (int[] row : grid)
            countingSort(row);
        int ans = 0;
        for (int i = 0; i < grid[0].length; i++) {
            int maxE = 0;
            for (int j = 0; j < grid.length; j++)
                maxE = Math.max(maxE,grid[j][i]);
            ans+=maxE;
        }
        return ans;
    }
    public static void countingSort(int[] arr) {
        int[] c = new int[101];
        for (int n : arr) c[n]++;
        for (int i = 1; i < c.length; i++) c[i] += c[i-1];
        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[c[arr[i]] - 1] = c[arr[i]];
            c[arr[i]]--;
        }
        System.arraycopy(b, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        countingSort(new int[] {5,4,3,2,1});
    }
}
