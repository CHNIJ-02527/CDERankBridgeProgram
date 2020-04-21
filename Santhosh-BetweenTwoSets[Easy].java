package com.cts.bridgeprogram.ds;
import java.util.*;
public class BetweenTwoSets {
	/*public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a[] = new int[n];
		int b[] =  new int[m];
		int total = 0;
		boolean add = true;
		for(int i=0;i<n;i++) {
			a[i] = scanner.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i] = scanner.nextInt();
		}
		for(int i=1;i<=100;i++) {
			add = true;
			for(int j=0;j<a.length;j++) {
				if(i%a[j]!= 0) {
					add = false;
					break;
				}
			}
			for(int k=0;k<b.length;k++) {
				if(add==false) {
					break;
				}
				if(b[k]%i!= 0) {
					add = false;
					break;
				}
			}
			if(add==true) {
				total++;
			}
		}
				System.out.println(total);
				scanner.close();
	}
}
*/  
	
	/*private static void find(int[] a, int[] b) {
    
    int total = 0;
    boolean add = true;
    
    for(int i = 1; i <= 100; i++) {
      add = true;
        for(int j = 0; j < a.length; j++) {
            if(i%a[j] != 0){
                add = false;
                break;
            }
        }
        for(int k = 0; k < b.length; k++) {
            if(!add) break;
            if(b[k]%i != 0){
                add = false;
                break;
            }
        }
      if(add) total++;  
    }
   System.out.println(total); 
}
*/
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] a = new int[n];
    int[] b = new int[m];
    int total = 0;
    boolean add = true;
    
    for(int i=0; i < n; i++){
        a[i] = scanner.nextInt();
    }
    
    for(int i=0; i < m; i++){
        b[i] = scanner.nextInt();
    }
    //find(a,b);
    for(int i = 1; i <= 100; i++) {
        add = true;
          for(int j = 0; j < a.length; j++) {
              if(i%a[j] != 0){
                  add = false;
                  break;
              }
          }
          for(int k = 0; k < b.length; k++) {
              if(!add) break;
              if(b[k]%i != 0){
                  add = false;
                  break;
              }
          }
        if(add) total++;  
      }
     System.out.println(total); 
     scanner.close();
}
}