import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


        public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int pivot = scanner.nextInt();
        int pos = 0;
        
        int[] a = new int[len];
        for(int i=0; i<len ; i++){
            a[i] = scanner.nextInt();
            
        }
     
        
        for(int i=0; i< pivot ;i++){
             int temp = a[0];
            for(int j =1; j<len; j++){
               a[j-1] = a[j];
                
            }
          a[len-1] = temp;
        }
        
        for(int i=0; i< len; i++){
            System.out.print(a[i] + " ");
        }
        
    }
}
