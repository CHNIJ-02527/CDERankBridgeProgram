import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the reverseArray function below.
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] a = new int[length];
        for (int i = 0; i < length ; i++) {
            a[i] = sc.nextInt(); 
        }
        for (int i = 0; i < length; i++){
            System.out.print(a[length-i-1] + " ");
        }
    }
}
