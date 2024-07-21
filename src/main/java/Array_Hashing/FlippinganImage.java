package Array_Hashing;

import java.util.Arrays;

public class FlippinganImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++){
            int[] row = new int[image[i].length];
            System.arraycopy(image[i],0,row,0,row.length);
            for (int j = image[i].length-1; j >= 0; j--)
                image[i][j] = 1-row[image[i].length-j-1];
            System.out.println(Arrays.toString(image[i]));
        }
        return image;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][]{
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        })));
        System.out.println(~1);

    }

}
