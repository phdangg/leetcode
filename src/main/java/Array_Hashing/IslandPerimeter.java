package Array_Hashing;

import java.util.Arrays;

public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    if (i - 1 >= 0 && grid[i-1][j] == 1) {
                        count--;
                        continue;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(islandPerimeter(new int[][]{
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        }));
    }
}
/*
                {1,2,1,1},
                {2,2,2,1},
                {1,2,1,1},
                {1,2,1,1}

 */
