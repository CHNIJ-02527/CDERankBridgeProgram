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

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    return 0;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int maxA = 0;
        int minB = 101;

        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            int tmp = in.nextInt();
            maxA = tmp > maxA ? tmp:maxA;
            a[a_i] = tmp;
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            int tmp = in.nextInt();
            minB = tmp < minB ? tmp:minB;
            b[b_i] = tmp;
        }        

        int integersBetween = 0;

        intCheck: 
        for(int i = maxA; i <= minB; i += maxA)
        {
            //Check if all A are a factor of i
            for(int num : a)
            {
                if(i%num != 0)
                {
                    continue intCheck;
                }
            }

            //Check if i is a factor of all B
            for(int num : b)
            {
                if(num%i != 0)
                {
                    continue intCheck;
                }
            }
            integersBetween++;
        }
        System.out.println(integersBetween);
    }

}
 