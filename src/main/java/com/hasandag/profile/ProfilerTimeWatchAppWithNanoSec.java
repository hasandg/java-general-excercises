package com.hasandag.profile;

import org.apache.commons.lang3.time.StopWatch;

import static com.hasandag.profile.ProfileApp.computeFibonacci;

public class ProfilerTimeWatchAppWithNanoSec {

    private static int NANO_TO_MICRO = 1_000; // 1 millisecond = 1000 microseconds = 1_000_000 nanoseconds

    public static void main(String[] args) {
        System.out.println("Starting profile...");

        long start = System.nanoTime();
        long startInMillis = System.currentTimeMillis();

        // Call the method that takes some time
        long result = computeFibonacci(10); // Example of a time-consuming task

        System.out.println("Time taken in micros : " + (System.nanoTime() - start) / NANO_TO_MICRO);
        System.out.println("Time taken in millis : " + (System.currentTimeMillis() - startInMillis));

        System.out.println("-----------------------------------------------------------------------------------------");

    }
}
