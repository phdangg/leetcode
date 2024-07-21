package Array_Hashing;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n / 2; i++){
            sum += mat[i][i] + mat[i][n-1-i];
        }
        for (int i = n-1; i >= n / 2; i--)
            sum += mat[i][n-i-1] + mat[i][i];
        if (mat.length % 2 != 0) sum -= mat[n/2][n/2];
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
        }));
    }
}
