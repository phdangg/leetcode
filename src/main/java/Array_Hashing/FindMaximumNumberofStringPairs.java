package Array_Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMaximumNumberofStringPairs {
    public static int maximumNumberOfStringPairs(String[] words) {
        int cnt = 0;
        Map<String,String> s = new HashMap<>();
        for (String word : words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!s.containsKey(key)){
                s.put(key,word);
                continue;
            }
            if (new StringBuilder(word).reverse().toString().equals(s.get(key))) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(maximumNumberOfStringPairs(new String[]{"cd","ac","dc","ca","zz"}));
    }
}
