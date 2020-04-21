package com.cts.bridgeprogram.ds;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MagicSquare {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {

        int square[][] = new int[][]{
            {2,9,4,7,5,3,6,1,8},
            {6,7,2,1,5,9,8,3,4},
            {8,1,6,3,5,7,4,9,2},
            {4,3,8,9,5,1,2,7,6},
            {4,9,2,3,5,7,8,1,6},
            {2,7,6,9,5,1,4,3,8},
            {6,1,8,7,5,3,2,9,4},
            {8,3,4,1,5,9,6,7,2}
        };

        int min = Integer.MAX_VALUE;
        for(int i=0;i<square.length;i++){
            int total=0;
            for(int j=0;j<square[i].length;j++){
                total = total+Math.abs(s[j/3][j%3]-square[i][j]);
            }
            if(total<min){
                min=total;
            }
        }
        return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
