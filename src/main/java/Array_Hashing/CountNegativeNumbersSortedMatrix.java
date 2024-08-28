package Array_Hashing;

public class CountNegativeNumbersSortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            for (int n : row) if (n < 0) count++;
        }
        return count;
    }
}
