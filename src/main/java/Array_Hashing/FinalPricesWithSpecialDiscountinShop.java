package Array_Hashing;

import java.util.Arrays;

public class FinalPricesWithSpecialDiscountinShop {
    public static class Stack {
        private final int maxSize; // Maximum size of the stack
        private final int[] stackArray; // Array to store stack elements
        private int top; // Index of the top element

        // Constructor to initialize the stack
        public Stack(int size) {
            this.maxSize = size;
            this.stackArray = new int[maxSize];
            this.top = -1; // Indicates the stack is initially empty
        }

        // Push method to add an element to the top of the stack
        public void push(int value) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push " + value);
                return;
            }
            stackArray[++top] = value;
        }

        // Pop method to remove and return the top element of the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop.");
                return -1;
            }
            return stackArray[top--];
        }

        // Peek method to return the top element without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot peek.");
                return -1;
            }
            return stackArray[top];
        }

        // Method to check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Method to check if the stack is full
        public boolean isFull() {
            return top == maxSize - 1;
        }

        // Method to get the current size of the stack
        public int size() {
            return top + 1;
        }
    }
    public static int[] finalPrices(int[] prices) {
        Stack s = new Stack(prices.length);
        int[] next_lesser = new int[prices.length];
        Arrays.fill(next_lesser,prices.length);
        for (int i = 0; i < prices.length; i++){
            while(!s.isEmpty() && prices[s.peek()] >= prices[i])
                next_lesser[s.pop()] = i;
            s.push(i);
        }
        for (int i = 0; i < prices.length; i++) {
            prices[i] -= next_lesser[i] == prices.length ? 0 : prices[next_lesser[i]];
        }
        return prices;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(new int[]{10, 1, 1, 6})));
    }
}
