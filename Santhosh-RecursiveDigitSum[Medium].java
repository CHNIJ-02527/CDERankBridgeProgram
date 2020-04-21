package com.cts.bridgeprogram.ds;

import java.util.Scanner;

public class RecursiveDigitSum {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String number = scanner.next();
		int k = scanner.nextInt();
		int sum = 0;
		for(int i=0;i<number.length();i++) {
			sum += number.charAt(i)-'0';
		}
		//System.out.println("After first adding the number individaully ==> "+sum);
		sum=sum*k;
		//System.out.println("After multiplying the sum with k ==> "+sum);
		int sum2 = 0;
		while(sum>=10) {
			sum2 = 0; 
			while(sum!=0) {
				sum2=sum2+sum%10; 
			//	System.out.println("Sum2 in while loop sum = >"+sum+"sum mod=>"+sum%10);
			//	System.out.println("Sum2 in while loop = >"+sum2);
				sum=sum/10;
			//	System.out.println("Sum in while loop division = > "+sum);
			}
			sum = sum2;
		}
		System.out.println("===>"+sum2);
		scanner.close();
 	}
}
