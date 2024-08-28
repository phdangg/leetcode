package Array_Hashing;

/*
You are given an array of strings words and a string pref.

Return the number of strings in words that contain pref as a prefix.

A prefix of a string s is any leading contiguous substring of s.

Example 1:

Input: words = ["pay","attention","practice","attend"], pref = "at"
Output: 2
Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".


Example 2:

Input: words = ["leetcode","win","loops","success"], pref = "code"
Output: 0
Explanation: There are no strings that contain "code" as a prefix.

*/
public class CountingWordsWithaGivenPrefix {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word: words) {
            String wordPrefix = word.substring(0, Math.min(pref.length(), word.length()));
            if (wordPrefix.equals(pref)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(prefixCount(new String[] {"pay","attention","practice","attend"}, "at"));
    }
}
