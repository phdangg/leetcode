package Array_Hashing;

import java.util.ArrayList;
import java.util.List;

public class PointsThatIntersectWithCars {
    public static int numberOfPoints(List<List<Integer>> nums) {
        int[] arr = new int[102];
        for(List<Integer> l:nums)
        {
            int start = l.get(0);
            int end = l.get(1);
            arr[start]++;
            arr[end+1]--;
        }
        int ans =0;
        for( int i=1;i<102;i++)
        {
            arr[i]+=arr[i-1];
            if(arr[i]>0)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(new ArrayList<Integer>(){
            {
                add(3);
                add(6);
            }
        });
        nums.add(new ArrayList<Integer>(){
            {
                add(1);
                add(5);
            }
        });
        nums.add(new ArrayList<Integer>(){
            {
                add(4);
                add(7);
            }
        });
        System.out.println(numberOfPoints(nums));
    }
}
