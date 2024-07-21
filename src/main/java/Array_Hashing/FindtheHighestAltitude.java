package Array_Hashing;

public class FindtheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length+1];
        int max = alt[0];
        for (int i = 1; i < alt.length;i++) {
            alt[i] = gain[i - 1] + alt[i - 1];
            max = Math.max(max,alt[i]);
        }
        return max;
    }
}
