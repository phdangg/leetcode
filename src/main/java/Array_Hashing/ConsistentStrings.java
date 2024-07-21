package Array_Hashing;

import java.util.HashSet;
import java.util.Set;

public class ConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words)
    {
        boolean[] alphabets = new boolean[26];
        int result = 0;

        for(char c : allowed.toCharArray())
        {
            alphabets[c-'a'] = true;
        }

        for(String w : words)
        {
            if(fun(w,alphabets))
                ++result;
        }

        return result;
    }

    public static boolean fun(String w,boolean[] alphabets)
    {
        for(int i = 0;i < w.length();i++)
        {
            if(!alphabets[w.charAt(i)-'a']) return false;
        }

        return true;
    }
}
