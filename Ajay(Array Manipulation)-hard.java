import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Scanner sc2 = new Scanner(s).useDelimiter(" ");
        String j = sc2.next();
        int p = Integer.parseInt(j);
        long[] n = new long[p];
        int counter = 0;
        while (sc.hasNextLine()){
            s=sc.nextLine();
            Scanner sc3 = new Scanner(s).useDelimiter(" ");
            int a = Integer.parseInt(sc3.next());
            int b = Integer.parseInt(sc3.next());
            long k = Long.parseLong(sc3.next());
            
            n[a-1]+=k;
            try{n[b]-=k;}
            catch(Exception e){};
            
        }
        long high = 0;
        long sum = 0;
        for (int k = 0; k<p; k++){
            sum+=n[k];
            if (sum>high){
                high = sum;
            }
        }
        System.out.println(high);
    }
}
