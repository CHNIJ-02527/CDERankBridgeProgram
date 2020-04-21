import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static long sum=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        long [] a=new long[T];
        for(int i=0;i<T;i++){
            a[i]=sc.nextLong();
            
            sum+=a[i];
            
            
        }System.out.println(sum);
        
    }
}
