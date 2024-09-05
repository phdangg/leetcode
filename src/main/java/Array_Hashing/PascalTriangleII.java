package Array_Hashing;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        rowIndex += 1;
        int[][] pascal = new int[rowIndex][rowIndex];
        for (int i = 0; i < rowIndex; i++) pascal[0][i] = 1;
        for (int i = 0; i < rowIndex; i++) pascal[i][0] = 1;
        for (int i = 1; i < rowIndex; i++) {
            for (int j = 1; j < rowIndex; j++) {
                pascal[i][j] = pascal[i-1][j] + pascal[i][j-1];
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
            ans.add(pascal[i][rowIndex-i-1]);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
