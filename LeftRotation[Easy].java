package com.cts.bridgeprogram.ds;


import java.util.*;


public class LeftRotation {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int rotations = scanner.nextInt();
        int array1[] =  new int[numberOfElements];
        int array2[] =  new int[numberOfElements];
        int index;
        for(int i=0;i<numberOfElements;i++){
            array1[i]=scanner.nextInt();
        }
        for(int i=0;i<numberOfElements;i++){
            index=i-rotations;
            if(index<0){
                index=numberOfElements+index;
            }
            array2[index]=array1[i];
        }
        for(int i=0;i<numberOfElements;i++){
            System.out.print(array2[i]+" ");
        }
        scanner.close();
    }

}
