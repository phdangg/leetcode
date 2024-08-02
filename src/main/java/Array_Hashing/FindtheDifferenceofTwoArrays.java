package Array_Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindtheDifferenceofTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);
        List<Integer> list = new ArrayList<>();
        for (Integer i : set1) if (!set2.contains(i)) list.add(i);
        ans.add(list);
        list = new ArrayList<>();
        for (Integer i : set2) if (!set1.contains(i)) list.add(i);
        ans.add(list);
        return ans;

    }
}
