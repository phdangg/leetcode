package Array_Hashing;

import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;

import java.util.Arrays;

public class SortArraybyIncreasingFrequency {
    public static int[] frequencySort(int[] nums) {
        int[] c = new int[201];
        for (int n : nums) c[n+100]++;
        int idx = 0;
        while (idx < nums.length){
            int min = 101;
            int idxMin = -1;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == 0) continue;
                if (c[i] <= min && idxMin < i) {
                    min = c[i];
                    idxMin = i;
                }
            }
            System.out.println(idxMin-100);
            while (c[idxMin] != 0 & idx < nums.length){
                nums[idx] = idxMin-100;
                idx++;
                c[idxMin]--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequencySort(new int[]{-79,40,21,40,30,-100,-50,-79,-51,30,-65,-13,-46,100,40,-65,-13,100,40,-79,55,68,55,68,68,30,79,-51,68,21,-60,40,79,30,55,-65,-13,-46,-100,-50,21,-60,-51,100,-51,-50,30,100,40,68,-13,-65})));
        //System.out.println(Arrays.toString(frequencySort(new int[]{-100,-100,-55,-55})));
    }
}
