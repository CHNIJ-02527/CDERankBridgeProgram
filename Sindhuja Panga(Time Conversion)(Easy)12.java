import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if(s.endsWith("PM") && !s.substring(0,2).equals("12")) {
            int hrs = 12 + Integer.parseInt(s.substring(0,2));
            String rem =s.substring(2,8);
            System.out.println(hrs + rem);
        }
        else {
            if(s.substring(0,2).equals("12") && s.endsWith("AM")) {
                String hrs = "00";
                String rem = s.substring(2,8);
                System.out.println(hrs + rem);
            }
            else
                System.out.println(s.substring(0,8));
        }
    }
}
