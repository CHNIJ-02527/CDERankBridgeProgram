import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
      
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();    
        int d=sc.nextInt();  
        int a[]=new int[n]; 
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            a[(i-d+n)%n] = ele;
        }
      
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
