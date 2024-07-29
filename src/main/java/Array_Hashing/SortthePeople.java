package Array_Hashing;

import java.util.*;
import java.util.stream.Collectors;

public class SortthePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> mp = new HashMap<>();
        for (int i = 0; i < names.length; i++){
            mp.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for (int i = 0; i < names.length; i++){
            names[i] = mp.get(heights[names.length - i - 1]);
        }
        return names;
    }

    public static void main(String[] args) {
        System.out.println(sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170}));
    }
}
