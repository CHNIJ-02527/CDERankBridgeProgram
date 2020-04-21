import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        final int v = scanner.nextInt();
        long res = 0;
        for(int i = 0; i<v; i++) res += scanner.nextInt();
        System.out.println(res);
    }
}
