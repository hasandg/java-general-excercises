import java.util.*;
import java.io.*;

class JavaLoops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            calculateSandPrint(a,b,n);
        }


        in.close();
    }


    static void calculateSandPrint(int a, int b, int n){
        int current = 0;
        for(int i=0;i<n;i++){
            if(i==0){
                current = a + (int)Math.pow(2,i)*b;
            }else{
                current = current + (int)Math.pow(2,i)*b;
            }
            //System.out.print(current + " ");
            System.out.printf("%s ",current);
        }

        System.out.println();

    }
}
