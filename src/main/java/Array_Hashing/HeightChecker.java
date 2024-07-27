package Array_Hashing;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        // Edge case: if heights array is empty
        if (heights == null || heights.length == 0) {
            return 0;
        }

        int maxHeight = 100; // Assuming maximum possible height is 100
        int[] heightCounts = new int[maxHeight + 1];

        // Count the occurrences of each height
        for (int height : heights) {
            heightCounts[height]++;
        }

        int count = 0;
        int currentHeight = 0;

        // Compare the original array with the expected positions based on counts
        for (int i = 0; i < heights.length; i++) {
            // Find the next height in the expected sorted order
            while (heightCounts[currentHeight] == 0) {
                currentHeight++;
            }

            // If current height in heights does not match the expected height
            if (heights[i] != currentHeight) {
                count++;
            }
            // Decrement the count for the current height
            heightCounts[currentHeight]--;
        }

        return count;
    }

    public static void main(String[] args) {
        //[0, 1, 1, 1, 1, 2, 2, 2, 2]
        //[0, 2, 1, 2, 1, 1, 2, 2, 1]
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
    }
}
