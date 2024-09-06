package Array_Hashing;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {
    public static void merge(Pair[] mp, int l, int m, int r) {
        Pair[] left = new Pair[m-l+1];
        Pair[] right = new Pair[r-m];
        for (int i = 0; i < left.length; i++) left[i] = mp[l+i];
        for (int i = 0; i < right.length; i++) right[i] = mp[m+i+1];
        int i = 0, j = 0;
        while (i < left.length && j < right.length) {
            if ((int)left[i].getValue() < (int)right[j].getValue()) mp[l++] = left[i++];
            else mp[l++] = right[j++];
        }
        while (i < left.length) mp[l++] = left[i++];
        while (j < right.length) mp[l++] = right[j++];
    }
    public static void mergeSort(Pair[] mp, int l, int r) {
        if (l>=r) return;
        int m = (l+r)/2;
        mergeSort(mp,l,m);
        mergeSort(mp,m+1,r);
        merge(mp,l,m,r);
    }
    public static String[] findRelativeRanks(int[] score) {
        Pair<Integer,Integer>[] mp = new Pair[score.length];
        for (int i = 0; i < score.length; i++) {
            mp[i] = new Pair<>(i,score[i]);
        }
        mergeSort(mp,0,mp.length-1);
        String[] ans = new String[score.length];
        for (int i = mp.length - 1; i >=0 ; i--) {
            if (i == mp.length - 1) {
                ans[mp[i].getKey()] = "Gold Medal";
            } else if (i == mp.length - 2) {
                ans[mp[i].getKey()] = "Silver Medal";
            } else if (i == mp.length - 3) {
                ans[mp[i].getKey()] = "Bronze Medal";
            } else ans[mp[i].getKey()] = String.valueOf(mp.length-i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{5, 4, 3, 2, 1})));
    }

}
// 1 2 3 4 5