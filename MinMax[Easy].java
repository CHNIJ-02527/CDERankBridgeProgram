package com.cts.bridgeprogram.ds;
import java.util.*;
public class MinMax {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int a[] = new int[5];
        //int min=0,max=0; gives error bcz we want 64bit
        long min=0,max=0;
        for(int i=0;i<5;i++) {
            a[i]=scanner.nextInt();
        }
            Arrays.parallelSort(a);
            for(int i=0;i<4;i++) {
                min = min+a[i];
               // System.out.println("Min"+min);
                max = max+a[i+1];
               // System.out.println("Max"+max);
            }
            System.out.println(min+" "+max);
            scanner.close();
    }
}
