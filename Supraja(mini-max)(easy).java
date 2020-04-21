import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long total=0, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for (int i=0; i<5; i++) {
            int current=s.nextInt();
            total+=current;
            max=Math.max(max, current);
            min=Math.min(min, current);
        }
        System.out.println((total-max)+" "+(total-min));
    }
}