package Array_Hashing;

import java.util.*;

public class SubarraysElementSumofSquaresI {
    public static int sumCounts(List<Integer> nums) {
        int sum = nums.size();
        for (int i = 0; i < nums.size()-1;i++){
            Set<Integer> distinct = new HashSet<>();
            distinct.add(nums.get(i));
            for (int j = i + 1; j < nums.size(); j++){
                distinct.add(nums.get(j));
                sum += (int) Math.pow(distinct.size(),2);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        System.out.println(sumCounts(nums));
    }
}
