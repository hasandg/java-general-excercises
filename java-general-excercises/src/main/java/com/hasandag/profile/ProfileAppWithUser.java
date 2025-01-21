package com.hasandag.profile;

import java.util.ArrayList;
import java.util.List;

public class ProfileAppWithUser {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting application...");
        List<User> users = new ArrayList<>();

        // Call the method that takes some time
        long startTime = System.currentTimeMillis();
         addAllUser(users); // Example of a time-consuming task
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: " + (endTime - startTime) + " ms");
        System.out.println("Aapplication ended...");
    }

    private static void addAllUser(List<User> users) throws InterruptedException {
        for (int i = 0; i < 1000000000; i++) {
            //Thread.sleep(10);
            //users.add(new User(i, "User" + i));
            users.add(new User());
        }
    }


}