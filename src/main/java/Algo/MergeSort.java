package Algo;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr, int left, int mid, int right) {
        int[] leftArr = new int[mid-left+1];
        int[] rightArr = new int[right-mid];

        for (int i = 0; i < leftArr.length; i++)
            leftArr[i] = arr[left+i];
        for (int i = 0; i < rightArr.length; i++)
            rightArr[i] = arr[mid+i+1];

        int i = 0, j= 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (compare(leftArr[i],rightArr[j]) < 0)
                arr[left++] = leftArr[i++];
            else arr[left++] = rightArr[j++];
        }
        while (i < leftArr.length)
            arr[left++] = leftArr[i++];
        while (j < rightArr.length)
            arr[left++] = rightArr[j++];

    }
    public static int compare(int a, int b) {
        int diff = Integer.bitCount(a) - Integer.bitCount(b);
        // in case of two or more integers have the same number of 1's
        // you have to sort them in ascending order.
        if(diff==0) return Integer.compare(a,b);

        else return diff;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = (left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    public static int sort(int[] arr){
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sort(new int[]{0,1,2,3,4,5,6,7,8}));
    }
}
