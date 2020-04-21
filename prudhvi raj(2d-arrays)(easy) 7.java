import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] numArr = new String[6][];
        int lSum = 0;
        for(int i=0; i<6; i++){
            numArr[i]=scan.nextLine().split(" ");
        }
        
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                int sum = Integer.parseInt(numArr[i][j])+Integer.parseInt(numArr[i][j+1])+Integer.parseInt(numArr[i][j+2])+Integer.parseInt(numArr[i+1][j+1])+Integer.parseInt(numArr[i+2][j])+Integer.parseInt(numArr[i+2][j+1])+Integer.parseInt(numArr[i+2][j+2]);
                if(i==0 && j==0){
                    lSum=sum;
                }else{
                    if(sum>lSum){
                        lSum=sum;
                    }
                }
            }
        }
        System.out.println(lSum);
    }
}
