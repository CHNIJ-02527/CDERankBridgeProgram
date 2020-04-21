import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) {
        
        int n,i,j,sum1=0,sum2=0,diff=0;
            Scanner sc=new Scanner(System.in);
            
            n=sc.nextInt();
            
            int[][] arr=new int[n][n];
            
            for(i=0;i<n;i++)
                for(j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                    
                }

            for(i=0;i<n;i++)             
                {
                    sum1=sum1+arr[i][i];
                    
                }
            
            for(i=n-1,j=0;i>=0;i--,j++)
            {
                sum2=sum2+arr[j][i];
                
            }
            
            diff=Math.abs(sum1-sum2);
            System.out.println(diff);
             
    }
}
