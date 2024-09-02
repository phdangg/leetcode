package Array_Hashing;

import java.util.ArrayList;
import java.util.List;

public class MergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] mp = new int[1001];
        for (int[] item : items1) mp[item[0]] += item[1];
        for (int[] item : items2) mp[item[0]] += item[1];
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 1; i < mp.length; i++) {
            if (mp[i] == 0) continue;
            int finalI = i;
            ret.add(new ArrayList<Integer>(){
                {
                    add(finalI);
                    add(mp[finalI]);
                }
            });
        }
        return ret;
    }
}
