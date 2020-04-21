import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

         public static void main(String[] args) {
        String a[]=new String[1000];
        String b[]=new String[1000];
        String str;
        int n,p,i,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       for(i=0;i<n;i++)
            a[i]=sc.next();
        p=sc.nextInt();
        while(p>0)
        {
           p=p-1;
            m=0;
           str=sc.next();
            for(i=0;i<n;i++)
            {
               if(a[i].equals(str)) 
                   m++;
            }
            System.out.println(m);
        }
        
     }
}
