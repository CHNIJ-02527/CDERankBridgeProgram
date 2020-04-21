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
        long n1 = 0; 
      for(int i=0; i<n.length(); i++) {
          n1 += Integer.parseInt(n.charAt(i)+"");
      } 
      n1 =  rds(n1*k);
      int n2 = (int) n1;
      return n2;
    }
    private static long rds(long n) {
      if(n<10) {
        return n; 
      }
      else {
        int n1 = 0;
        while(n>0) {
          n1 += n % 10;
          n = n/10; 
        } 
        return rds(n1); 
      }
      
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
