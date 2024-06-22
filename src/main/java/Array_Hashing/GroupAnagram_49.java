package Array_Hashing;

import java.util.*;

public class GroupAnagram_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        for (String s : strs){
            char[] key = s.toCharArray();
            Arrays.sort(key);
            mp.computeIfAbsent(new String(key), k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
