import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long min = Long.MAX_VALUE;
        long max = 0;
        long sum = 0;
        for(int i=0; i<5; i++)
        {
            long curr = in.nextLong();  
            if(max < curr)
            {
                max = curr;
            }
            if(min > curr)
            {
                min = curr;
            }
            
            sum += curr;
        }
        long minSum = sum - max;
        long maxSum = sum - min;
        System.out.println(minSum + " " + maxSum);
    }
}
