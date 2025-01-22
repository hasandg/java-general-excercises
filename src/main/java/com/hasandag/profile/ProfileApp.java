package com.hasandag.profile;

public class ProfileApp {
    public static void main(String[] args) {
        System.out.println("Starting profile...");

        // Call the method that takes some time
        long startTime = System.currentTimeMillis();
        long result = computeFibonacci(50); // Example of a time-consuming task
        long endTime = System.currentTimeMillis();

        System.out.println("Result: " + result);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }

    // Method to compute the nth Fibonacci number (inefficiently)
    public static long computeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return computeFibonacci(n - 1) + computeFibonacci(n - 2);
    }
}