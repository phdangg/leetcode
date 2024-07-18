package Array_Hashing;

import java.util.ArrayList;

public class CreateTargetArray_1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++){
            target.add(index[i],nums[i]);
        }
        return target.stream().mapToInt(i -> i).toArray();
    }

}
