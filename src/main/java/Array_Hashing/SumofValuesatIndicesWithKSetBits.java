package Array_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumofValuesatIndicesWithKSetBits {
    static int countSetBits(int n) {
        int count = 0;
        while(n != 0) {
            count += n & 1;
            n = n>>1;
        }
        return count;
    }
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++){
            if (countSetBits(i) == k) sum+=nums.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumIndicesWithKSetBits(Arrays.asList(new Integer[]{5,10,1,5,2}),1));
    }
}
