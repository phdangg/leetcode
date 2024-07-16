package Array_Hashing;

import java.util.Arrays;
import java.util.Comparator;

public class WidestVerticalArea_1673 {
    public int maxWidthOfVerticalArea(int[][] points) {
        if (points.length == 1) return points[0][0];
        if (points.length == 2) return points[1][0] - points[0][0];
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0],o2[0]);
            }
        });
        int n = points.length;
        int max = points[n-1][0] - points[n-2][0];
        for (int i = n - 2; i >= 1; i--)
            max = Math.max(max, points[i][0] - points[i-1][0]);
        return max;
    }
}
