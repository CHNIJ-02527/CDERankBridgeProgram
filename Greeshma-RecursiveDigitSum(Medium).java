import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution
{
    public static void main(String agrs[])
    {
      Scanner sc=new Scanner(System.in);
      String n=sc.next();
      int k=sc.nextInt();
      long sum=0;
      for(int i=0;i<n.length();i++)
      {
        sum= sum+n.charAt(i)-'0';
      }
      sum=sum*k;
      long p=0;
      while(sum>=10)
      {
       p=0;
       while(sum!=0)
       {
           p=p+sum%10;
           sum=sum/10;
       }
       sum=p;
      }
      System.out.println(p);
      sc.close();
    }
}