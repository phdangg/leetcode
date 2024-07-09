package Array_Hashing;

import java.util.Arrays;

public class LargestLocalValuesMatrix_2373 {
    public static int[][] largestLocal(int[][] grid) {
        int[][] result = new int[grid.length-2][grid.length-2];
        for(int i=0; i< grid.length-2; i++){
            for(int j=0; j< grid.length-2; j++){
                result[i][j] = findMaxElement(grid, i, j);
            }
        }
        return result;
    }

    public static int findMaxElement(int[][] grid, int m, int n){
        int max = Integer.MIN_VALUE;
        for(int i=m; i < m+3; i++){
            for(int j=n; j < n+3; j++){
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(largestLocal(new int[][]{{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}})[0]));
        System.out.println(Arrays.toString(largestLocal(new int[][]{{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}})[1]));
    }
}
