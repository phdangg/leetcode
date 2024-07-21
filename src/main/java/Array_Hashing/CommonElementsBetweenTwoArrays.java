package Array_Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommonElementsBetweenTwoArrays {
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] arr1 = new boolean[101];
        boolean[] arr2 = new boolean[101];

        for(int n : nums1)
            arr1[n] = true;
        for(int n : nums2)
            arr2[n] = true;

        int[] ans = {0,0};

        for(int n : nums1)
            if(arr2[n]) ++ans[0];
        for(int n : nums2)
            if(arr1[n]) ++ans[1];
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findIntersectionValues(new int[]{4,3,2,3,1}, new int[]{2,2,5,2,3,6})));
    }
}
