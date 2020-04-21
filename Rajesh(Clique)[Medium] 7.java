import java.io.*;
import java.util.*;

public class Solution {

    private static int solve(int mid, int n) {
        int a = n % mid;
        int b = mid - a;
        int c = n / mid  + 1;
        int d = n / mid;
        return a*c*b*d + a*(a - 1)*c*c/2 + b*(b - 1)*d*d/2;
    }
    
    private static int clique(int n, int m) {
        int low = 1;
        int high = n + 1;
        while (low + 1 < high) {
            int mid = low + (high - low)/2;
            if (solve(mid, n) < m)
                low = mid;
            else
                high = mid;
        }
        return high;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(clique(n, m));
        }
        
    }
}