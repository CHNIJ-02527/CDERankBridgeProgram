import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();

        int[] temp1;
        temp1 = new int [d];
        int[] temp2;
        temp2 = new int [a.length - d];

        for(int i=0;i<temp1.length;i++){
            temp1[i] = a[i];
        }

        int j =0;
        for(int i=temp1.length;i<a.length;i++){
            temp2[j] = a[i];
            j++;
        }

        int[] res;
        res = new int[a.length];
        int k=0;
        for(int i=temp2.length;i<res.length;i++){
            res[i] = temp1[k];
            k++;
        }

        for(int i=0;i<temp2.length;i++){
            res[i] = temp2[i];
        }
        
        

        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
