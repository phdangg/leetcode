package Array_Hashing;

import java.util.*;

public class LongestConsecutiveSequence_128 {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for (int n : nums) s.add(n);
        int longest = 0;
        for(int n : nums){
            if (!s.contains(n-1)){
                int length = 0;
                while (s.contains(n++)) length++;
                longest = Math.max(length,longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
