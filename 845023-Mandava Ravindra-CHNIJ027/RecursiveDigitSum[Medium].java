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
            BigInteger n1 = new BigInteger(n);
            n1 = n1.multiply(new BigInteger(k + ""));
            n1 = n1.remainder(new BigInteger("9"));
            return n1.intValue() == 0 ? 9 : n1.intValue();

        // int m = 0;
        // for(int i=0;i<n.length();i++){
        //     int t= Integer.parseInt(n.charAt(i) +"");
        //     m += t;
        // }
        // int q = m*k;

        /* 
        String q1 = q +"";
        while(q/10 !=0){
            q1 = q+"";
            int m1 =0;
            for(int i=0;i<q1.length();i++){
                int t= Integer.parseInt(q1.charAt(i) +"");
                m1 += t;
            }
            q = m1;
        }
        return q;
        */

        /*
        int flag =0;
        while(q/10 != 0){
            // System.out.println("While  " + q);
            int sum= 0;
            while(q!=0){
                sum += q%10;
                q = q/10;
            } 
            q = sum;
            if(flag==0) {
            q = sum*k;
            }
            else {
                q = sum;
            }
            flag =1;
        }
        return q;
        */
        
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
