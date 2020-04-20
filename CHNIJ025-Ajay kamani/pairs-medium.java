import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pairs {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int result = 0;
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                int difference = arr[j]-arr[i];
                if(difference == k) {
                    result++;
                }
                if(difference > k) {
                    break;
                }
            }
        }
 
        System.out.println(result);
        scanner.close();
    }
}