package Array_Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
    public int countGoodRectangles(int[][] rectangles) {
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        for (int[] rec : rectangles){
            int min = Math.min(rec[0],rec[1]);
            mp.put(min,mp.getOrDefault(min,0)+1);
        }
        return mp.lastEntry().getValue();

    }
}
