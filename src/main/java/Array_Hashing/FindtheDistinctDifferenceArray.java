package Array_Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 3,2,3,4,2
/*Example 1:

Input: nums = [1,2,3,4,5]
pref = [1,2,3,4,5]
surf = [4,3,2,1,0]
Output: [-3,-1,1,3,5]
Explanation: For index i = 0, there is 1 element in the prefix and 4 distinct elements in the suffix. Thus, diff[0] = 1 - 4 = -3.
For index i = 1, there are 2 distinct elements in the prefix and 3 distinct elements in the suffix. Thus, diff[1] = 2 - 3 = -1.
For index i = 2, there are 3 distinct elements in the prefix and 2 distinct elements in the suffix. Thus, diff[2] = 3 - 2 = 1.
For index i = 3, there are 4 distinct elements in the prefix and 1 distinct element in the suffix. Thus, diff[3] = 4 - 1 = 3.
For index i = 4, there are 5 distinct elements in the prefix and no elements in the suffix. Thus, diff[4] = 5 - 0 = 5.

Input: nums = [3,2,3,4,2]
pref = [1,2,2,3,3]
suf = [3,3,2,1,0]
Output: [-2,-1,0,2,3]
Explanation: For index i = 0, there is 1 element in the prefix and 3 distinct elements in the suffix. Thus, diff[0] = 1 - 3 = -2.
For index i = 1, there are 2 distinct elements in the prefix and 3 distinct elements in the suffix. Thus, diff[1] = 2 - 3 = -1.
For index i = 2, there are 2 distinct elements in the prefix and 2 distinct elements in the suffix. Thus, diff[2] = 2 - 2 = 0.
For index i = 3, there are 3 distinct elements in the prefix and 1 distinct element in the suffix. Thus, diff[3] = 3 - 1 = 2.
For index i = 4, there are 3 distinct elements in the prefix and no elements in the suffix. Thus, diff[4] = 3 - 0 = 3.

*/

public class FindtheDistinctDifferenceArray {
    public static int[] distinctDifferenceArray(int[] nums) {
        int[] pref = new int[nums.length];
        pref[0] = 1;
        for (int i = 1; i < pref.length; i++) {
            int[] freq = new int[51];
            for (int j = i; j >= 0; j--) freq[nums[j]]++;
            for (int c : freq) if (c!=0) pref[i]++;
        }
        int[] surf = new int[nums.length];
        for (int i = 0; i < surf.length; i++) {
            int[] freq = new int[51];
            for (int j = i + 1; j < surf.length; j++) freq[nums[j]]++;
            for (int c : freq) if (c!=0) surf[i]++;
        }
        for(int i = 0; i < nums.length; i++)
            nums[i] = pref[i] - surf[i];
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(distinctDifferenceArray(new int[]{3,2,3,4,2})));
    }
}
