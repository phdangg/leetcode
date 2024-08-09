package Array_Hashing;

public class DIStringMatch {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] perm = new int[n+1];
        int low = 0, high = n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') perm[i] = low++;
            else perm[i] = high--;
        }
        perm[n] = high;
        return perm;
    }
}
