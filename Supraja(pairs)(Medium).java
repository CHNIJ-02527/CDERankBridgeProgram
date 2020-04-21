import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     public static void main(String[] args) {
       
        Scanner ab=new Scanner(System.in);
        int n=ab.nextInt();
        int k=ab.nextInt();
        int count=0;
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
            arr[i]=ab.nextLong();
        Arrays.sort(arr);
        int i=0,j=1;
   
    while(j < n) {
        long diff = arr[j] - arr[i];
       
        if (diff == k) {
            count++;
            j++;
        } else if (diff > k) {
            i++;
        } else if (diff < k) {
            j++;
        }
    }
        System.out.println(count);
    }
}
