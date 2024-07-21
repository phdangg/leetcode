package Array_Hashing;

import java.util.Objects;

public class FindFirstPalindromic {
    public static boolean isPalindrome(String s){
        int low=0;
        int high=s.length()-1;
        while(low<high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String s: words){
            if(isPalindrome(s)){
                return s;
            }
        }
        return "";
    }
}
