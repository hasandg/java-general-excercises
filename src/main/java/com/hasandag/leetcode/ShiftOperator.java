package com.hasandag.leetcode;

public class ShiftOperator {

    public static void main(String args[]) {

        // >> (Signed right shift)
        System.out.println(-4 >> 1);
        System.out.println(-4 << 1);

        System.out.println(-1 >>> 1);
        System.out.println(-4 >>> 1);
        System.out.println(4 >>> 1);

        int y = 4;
        System.out.println("y>>=1 " + (y>>=1));
        System.out.println("y>>=1 " + (y>>=2));
        System.out.println("y>>=1 " + (y>>=2));
        System.out.println("y>>=1 " + (y>>=1));
        System.out.println("y>>=1 " + (y>>=1));


        // >>> (Unsigned right shift)
        System.out.println(7 >>> 1);

        // z is stored using 32- bit 2's complement form.9+
        // Binary representation of -1 is all 1s (111..1)
        int z = -1;

        System.out.println(z >>> 29);  // The value of 'z>>>29' is 00...0111
        System.out.println(z >>> 30);  // The value of 'z>>>30' is 00...0011
        System.out.println(z >>> 31);  // The value of 'z>>>31' is 00...0001

    }
}
