package Array_Hashing;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i+=2) length+=nums[i];
        int[] result = new int[length];
        int idx = 0;
        for (int i = 0; i < nums.length; i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            while (freq != 0){
                result[idx++] = val;
                freq--;
            }
        }
        return result;

    }
}
