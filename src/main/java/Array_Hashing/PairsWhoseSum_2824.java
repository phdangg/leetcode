package Array_Hashing;

import java.util.*;

public class PairsWhoseSum_2824 {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i) >= target) continue;
            for (int j = i + 1; j < nums.size(); j++){
                if (nums.get(i) + nums.get(j) < target)
                    count++;
            }
        }
        return count;
    }
}
