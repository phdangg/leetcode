package Array_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        int[][] pascal = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) pascal[0][i] = 1;
        for (int i = 0; i < numRows; i++) pascal[i][0] = 1;
        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < numRows; j++) {
                pascal[i][j] = pascal[i-1][j] + pascal[i][j-1];
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        int num = 1;
        while (num <= numRows) {
            int idx = 0;
            int idxRow = num;
            List<Integer> row = new ArrayList<>();
            while (idx < num) {
                row.add(pascal[idx][idxRow-1]);
                idxRow--;
                idx++;
            }
            ans.add(row);
            num++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
