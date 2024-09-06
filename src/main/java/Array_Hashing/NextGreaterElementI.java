package Array_Hashing;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementI {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        int[] next_greater = new int[nums2.length];
        Arrays.fill(next_greater,-1);
        for (int i = 0; i < nums2.length; i++) {
            while (!s.isEmpty() && nums2[s.peek()] < nums2[i])
                next_greater[s.pop()] = i;
            s.push(i);
        }
        int[] mp = new int[10_0001];
        for (int i = 0; i < nums2.length; i++) {
            mp[nums2[i]] = next_greater[i];
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = mp[nums1[i]] == -1 ? -1 : nums2[mp[nums1[i]]];
        }
        return nums1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
    }
}

/*
1  3  4  2
1  2 -1 -1

3
1

 */

