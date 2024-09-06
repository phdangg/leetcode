package Array_Hashing;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        List<String> ans = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder().append(nums[0]);
        int cons = 0;
        for (int i = 1; i < nums.length; i++) {
            cons++;
            if (nums[i] != nums[i-1] + 1) {
                if (cons > 1)
                    stringBuilder.append("->").append(nums[i-1]);
                ans.add(stringBuilder.toString());
                stringBuilder = new StringBuilder().append(nums[i]);
                cons = 0;
            }
        }
        if (cons > 0)
            stringBuilder.append("->").append(nums[nums.length-1]);
        ans.add(stringBuilder.toString());
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
    }
}
/*
Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"

 */