package Array_Hashing;

import java.util.Arrays;

public class FindNUniqueIntegersSumZero {
    public static int[] sumZero(int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n / 2; i++) {
            ans[i] = - (n/2 - i);
            ans[n-i-1] = (n/2 - i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(4)));
    }
}
/*
Given an integer n, return any array containing
n unique integers such that they add up to 0.

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
 */