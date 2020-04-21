import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        int max,min=0,countmax=0,countmin=0,i=1;
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        //assign first two values
                max=score[0];
        min=score[0];
    
        // your code goes here
        i=1;
        while(i<n)
            {
            if(score[i]>max)
                {
               
                max=score[i];
                countmax++;
            }
            else if(score[i]<min)
                {
               
                min=score[i];
                countmin++;
            }
            i++;
        }
        System.out.print(countmax+" "+countmin);
       
    }
}
