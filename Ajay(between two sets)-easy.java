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

public class Result {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int s=a[n-1],e=b[0];
       
        int k,no=0;
        for(int i=s;i<=e;i++)
            {k=0;
            for(int j=0;j<n;j++)
                {
                if(i%a[j]!=0)
                    {
                    k=1;break;}
            }
              for(int j=0;j<m;j++)
                {
                if(b[j]%i!=0)
                    {
                    k=1;break;}
            }
             if(k==0)
                 no++;
        }
        System.out.println(no);
    }
}
