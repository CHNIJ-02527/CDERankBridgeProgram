import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

   
 public static void main(String[] args) throws IOException{
       
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String time=br.readLine();
        int hur=Integer.parseInt(time.split(":")[0]);
        if(time.substring(time.length()-2).equals("PM") && hur!=12)
            hur+=12;
        if(time.substring(time.length()-2).equals("AM") && hur==12)
            hur=0;
        System.out.printf("%02d",hur);
        System.out.println(time.substring(2,time.length()-2));
    }
}
