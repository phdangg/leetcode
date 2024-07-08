package Array_Hashing;

import java.util.*;

public class TopKFrequent_347 {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        for (int i = 0; i < bucket.length; i++) bucket[i] = new ArrayList<>();
        Map<Integer,Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer,Integer> entry : freq.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }
        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && k >= 0; i--)
            if (!bucket[i].isEmpty()) result.addAll(bucket[i]);
        return result.stream().mapToInt(Integer::new).toArray();
    }

    public static void main(String[] args) {
        TopKFrequent_347 main = new TopKFrequent_347();
        System.out.println(Arrays.toString(main.topKFrequent(new int[]{-1,2,1,3,4},2)));
    }
}
