package Array_Hashing;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] c = new int[nums.length+1];
        for (int n : nums) c[n]++;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i < c.length; i++)
            if (c[i]==0) ans.add(i);
        return ans;

    }
}
