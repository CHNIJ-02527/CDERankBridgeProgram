package com.cts.bridgeprogram.ds;
import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int q[][] = new int[m][3];
		//what values have to be added in query
		for(int i=0;i<m;i++) {
			q[i][0]=scanner.nextInt();
			q[i][1]=scanner.nextInt();
			q[i][2]=scanner.nextInt();
		}
		
		//manipulating the array by adding q and subtracting q
		
		long finalArray[] = new long[n+2];
		for(int i=0;i<q.length;i++) {
			int a = q[i][0];
			int b = q[i][1];
			int k = q[i][2];
			finalArray[a] = finalArray[a]+k;
			finalArray[b+1] = finalArray[b+1]-k;
		}
		
		//to gaet the main array and finding the max value
		
		long maxValue = 0;
		long sum =0 ;
		for(int i=0;i<finalArray.length;i++) {
		sum = sum+finalArray[i];
		maxValue= Math.max(maxValue,sum);
		}
		
		System.out.println(maxValue);
		scanner.close();
	}

}
