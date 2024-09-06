package Array_Hashing;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int idx = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = idx; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    idx = ++j;
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        findContentChildren(new int[]{1,2,3},new int[]{3});
    }
}
