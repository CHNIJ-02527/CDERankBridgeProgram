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
        long num1 = 0; 
      for(int i=0; i<n.length(); i++) {
          num1 += Integer.parseInt(n.charAt(i)+"");
      } 
      num1 =  add(num1*k);
      int num2 = (int) num1;
      return num2;
    }
    private static long add(long n) {
      if(n<10) {
        return n; 
      }
      else {
        int num1 = 0;
        while(n>0) {
          num1 += n % 10;
          n = n/10; 
        } 
        return add(num1); 
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
