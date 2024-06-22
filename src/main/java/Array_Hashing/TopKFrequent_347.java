package Array_Hashing;

import java.util.*;

public class TopKFrequent_347 {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n: nums)
            freq.put(n,freq.getOrDefault(n,0)+1);

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int val = entry.getValue();
            if (bucket[val] == null) bucket[val] = new ArrayList<>();
            bucket[val].add(entry.getKey());
        }
        int[] result = new int[k];
        int pos = 0;
        for (int i = bucket.length - 1; i >= 0; i--){
            if (bucket[i] == null) continue;
            for (int j = 0; j < bucket[i].size() && pos < k; j++){
                result[pos] = bucket[i].get(j);
                pos++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TopKFrequent_347 main = new TopKFrequent_347();
        System.out.println(Arrays.toString(main.topKFrequent(new int[]{-1,2,1,3,4},2)));
    }
}
