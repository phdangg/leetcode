package Array_Hashing;

import java.util.HashSet;
import java.util.Set;

public class TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            for (int j = 0; j < duration && timeSeries[i] + j < timeSeries[i+1]; j++)
                count++;

        }
        return count + duration;
    }

    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[]{1,2},2));
    }
}
// 1 2
// start = 1, end = 1 + 2 = 3
// time = 2 < end
// end = time + dura = 2 + 2 = 4
