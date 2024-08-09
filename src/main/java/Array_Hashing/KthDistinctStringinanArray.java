package Array_Hashing;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringinanArray {
    public static String kthDistinct(String[] arr, int k) {
        if (arr.length < k) return "";
        Map<String,Integer> mp = new HashMap<>();
        for (String word : arr) mp.put(word,mp.getOrDefault(word,0)+1);
        int ith = 1;
        for (String l : arr){
            if (mp.get(l) == 1){
                if (ith != k) {ith++;continue;}
                return l;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[]{"d","b","c","b","c","a"},2));
    }
}
