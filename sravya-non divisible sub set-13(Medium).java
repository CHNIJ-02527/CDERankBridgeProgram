import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] remainders = new int[k];
        for (int i = 0; i < n; i++) {
            remainders[a[i] % k]++;
        }
        int count = 0;
        if (remainders[0] > 0) {
            count++;
        }
        for (int i = 1; i < k / 2.0; i++) {
            if (remainders[i] <= remainders[k - i]) {
                count += remainders[k - i];
            } else {
                count += remainders[i];
            }
        }
        if (k % 2 == 0 && remainders[k / 2] > 0) {
            count++;
        }
        System.out.println(count);        
    }
}
