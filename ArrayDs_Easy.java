package com.cts.bridgeprogram.ds;

import java.util.*;

public class ArrayDs_Easy {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numberOfElements = scanner.nextInt();
        int[] array= new int[numberOfElements];
    for (int i = 0; i <=array.length - 1; i++) {
        array[i]=scanner.nextInt();
    }
    for (int i = array.length - 1; i >= 0; i--) 
     System.out.print(array[i]+" ");
    scanner.close();
    }
}
