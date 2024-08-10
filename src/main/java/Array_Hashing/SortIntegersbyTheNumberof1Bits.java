package Array_Hashing;

public class SortIntegersbyTheNumberof1Bits {
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            arr[i] += Integer.bitCount(arr[i])*10001;
        }
        int n = 10000;
        int[] c = new int[n + (int)(Math.log(n) / Math.log(2)) + 1];
        for (int num : arr) c[num]++;
        for (int i = 1; i < c.length; i++) c[i] += c[i-1];
        int[] b = new int[arr.length];
        for (int i = 0; i < b.length; i++){
            b[c[arr[i]]-1] = arr[i]%10001;
            c[arr[i]]--;
        }
        return b;
    }
}
