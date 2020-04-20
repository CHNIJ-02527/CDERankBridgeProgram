import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] val = s.split(":",-1);
        String temp = s.substring(s.length() - 2);
        if(temp.equals("PM")){
            if(!val[0].equals("12")){
                int hh = Integer.parseInt(val[0]) + 12;
            val[0] = hh+"";
            }
            
        }
        else{
            if(val[0].equals("12")){
                val[0] = "00";
            }
        }
        val[2] = val[2].substring(0, 2);
        String res=val[0];
        // res.concat(val[0]);
        res = res.concat(":");
        res = res.concat(val[1]);
        res = res.concat(":");
        res = res.concat(val[2]);

        return res;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
