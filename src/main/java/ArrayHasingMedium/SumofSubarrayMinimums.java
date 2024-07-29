package ArrayHasingMedium;

import java.util.Arrays;
import java.util.Stack;

public class SumofSubarrayMinimums {
    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int[] previous_lesser = new int[n];
        int[] next_lesser = new int[n];
        Arrays.fill(next_lesser,n);
        for (int i = 0; i < n; i++){
            while (!s.isEmpty() && arr[s.peek()] > arr[i])
                next_lesser[s.pop()] = i;
            previous_lesser[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            int start = i - previous_lesser[i];
            int end = next_lesser[i] - i;
            sum += arr[i] * start * end;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumSubarrayMins(new int[]{3,1,2,4}));
    }
}
