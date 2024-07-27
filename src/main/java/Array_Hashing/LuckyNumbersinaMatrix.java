package Array_Hashing;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersinaMatrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++){
            int min = matrix[i][0], minIdx = 0;
            for (int j = 1; j < matrix[i].length; j++){
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                    minIdx = j;
                }
            }
            boolean max = true;
            for (int k = 0; k < matrix.length; k++){
                if (matrix[k][minIdx] > min){
                    max = false;
                    break;
                }
            }
            if (max) ans.add(min);

        }
        return ans;
    }
}
