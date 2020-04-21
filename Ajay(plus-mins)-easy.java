import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
         public static void fraction(int a[],int n)
    {
        double positive=0.0;
        double negative=0.0;
        double zero=0.0;
        for(int i=0;i<n;i++)
            if(a[i]>0) positive++;
            else if(a[i]<0) negative++;
            else zero++;
        System.out.println(positive/n);
    
        System.out.println(negative/n);
        
        System.out.println(zero/n);
        
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String input[]=br.readLine().split(" ");
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=Integer.parseInt(input[i]);
        fraction(a,n);
    }
}
