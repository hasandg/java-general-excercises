package com.hasandag.leetcode;

public class JavaSyncronizedBlocks {
    public static void main(String[] args) {
        final JavaSyncronizedBlocks jsb = new JavaSyncronizedBlocks();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    jsb.printNumbers(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(r, "ONE").start();
        new Thread(r, "TWO").start();
    }

    void printNumbers(int n) throws InterruptedException {


        synchronized (this) {
            for (int i = 1; i <= n; i++) {
                System.out.println(Thread.currentThread().getName() + " :: " + i);
                Thread.sleep(500);
            }
        }
    }
}
