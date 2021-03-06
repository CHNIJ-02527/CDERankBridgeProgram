import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the superDigit function below.
    static int superDigit(String n, int k) {
        long num = 0; 
      for(int i=0; i<n.length(); i++) {
          num += Integer.parseInt(n.charAt(i)+"");
      } 
      num =  helper(num*k);
      int num2 = (int) num;
      return num2;
    }
    private static long helper(long n) {
      if(n<10) {
        return n; 
      }
      else {
        int num = 0;
        while(n>0) {
          num += n % 10;
          n = n/10; 
        } 
        return helper(num); 
      }