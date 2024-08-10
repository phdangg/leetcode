package Algo;

import java.util.Arrays;

public class HeapSort {
    public static int parent(int i){
        return i/2;
    }
    public static int left(int i) {
        return 2*i+1;
    }
    public static int right(int i) {
        return 2*i+2;
    }
    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = left(i);
        int r = right(i);
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            heapify(arr,n,largest);
        }
    }

    public static int sort(int[] arr){
        for (int i = arr.length / 2  - 1; i >=0 ; i--)
            heapify(arr,arr.length,i);
        for (int i = arr.length - 1; i >= 0; i--){
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heapify(arr,i,0);
        }
        System.out.println(Arrays.toString(arr));
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sort(new int[]{4, 10, 3, 5, 1}));
    }

}
