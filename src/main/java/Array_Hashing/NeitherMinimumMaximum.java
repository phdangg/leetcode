package Array_Hashing;

public class NeitherMinimumMaximum {
    public static int findNonMinOrMax(int[] nums) {
        int[] c = new int[101];
        for (int n: nums) c[n]++;
        for (int i = 1; i < c.length; i++) c[i] += c[i-1];
        int[] b = new int[nums.length];
        for (int i = 0; i < b.length; i++) {
            b[c[nums[i]]-1] = nums[i];
            c[nums[i]]--;
        }
        for (int i = 1; i < b.length - 1; i++) {
            if (b[i] != b[0] || b[i] != b[b.length-1]) return b[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findNonMinOrMax(new int[]{1,2}));
    }
}

/*

Given an integer array nums containing distinct positive integers,
find and return any number from the array that is neither the minimum
nor the maximum value in the array, or -1 if there is no such number.

Return the selected integer.

Example 1:

Input: nums = [3,2,1,4]
Output: 2
Explanation: In this example, the minimum value is 1 and the maximum value is 4.
Therefore, either 2 or 3 can be valid answers.
Example 2:

Input: nums = [1,2]
Output: -1
Explanation: Since there is no number in nums that is neither the maximum nor the minimum, we cannot select a number that satisfies the given condition. Therefore, there is no answer.
Example 3:

Input: nums = [2,1,3]
Output: 2
Explanation: Since 2 is neither the maximum nor the minimum value in nums, it is the only valid answer.

 */
