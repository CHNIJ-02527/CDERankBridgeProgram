import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long min = Long.MAX_VALUE;
        long max = 0;
        long sum = 0;
        for(int i=0; i<5; i++)
        {
            long current = in.nextLong();  
            if(max < current)
            {
                max = current;
            }
            if(min > current)
            {
                min = current;
            }
            
            sum += current;
        }
        long minSum = sum - max;
        long maxSum = sum - min;
        System.out.println(minSum + " " + maxSum);
    }
}
