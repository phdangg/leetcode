package Array_Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoOutThree {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> s = new HashSet<>();
        int[] c = new int[101];
        for (int n : nums1) s.add(n);
        for (Integer i : s) c[i]++;
        s = new HashSet<>();
        for (int n : nums2) s.add(n);
        for (Integer i : s) c[i]++;
        s = new HashSet<>();
        for (int n : nums3) s.add(n);
        for (Integer i : s) c[i]++;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i < c.length; i++)
            if (c[i] == 2 && c[i] == 3)
                ans.add(i);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(twoOutOfThree(new int[]{1,2,3,1}, new int[]{2,3,}, new int[]{3}));
    }
}
