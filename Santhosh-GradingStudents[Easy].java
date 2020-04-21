import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            int grades = scanner.nextInt();
            if (grades >= 38) {
                if (grades % 5 >= 3) {
                    grades = (grades+5) - (grades % 5);
                }
            }
            System.out.println(grades);
        }
        scanner.close();
    }
}
