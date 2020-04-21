package com.cts.bridgeprogram.ds;
import java.util.*;
public class DivsibleSumPairs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int pairs = 0;
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = scanner.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if( (a[i]+a[j]) % k == 0) {
					pairs++;
				}
			}
		}
		System.out.println(pairs);
		scanner.close();
	}
}
