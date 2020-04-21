package com.cts.bridgeprogram.ds;
/*import java.io.*;
import java.util.*;

public class Staircase {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numberOfElements = scanner.nextInt();
	
		for(int i = 1; i <=numberOfElements ; i++) {
			for(int j = 1; j <= numberOfElements-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
*/
      /*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase {
    
    public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
        int numberOfElementsInFirstArray=scanner.nextInt();
        int numberOfElementsInSecondArray=scanner.nextInt();
        int sum=0;
        String[] inputInArrayOne=new String[numberOfElementsInFirstArray];
        String[] inputInArraySecond=new String[numberOfElementsInSecondArray];
        for(int i=0;i<numberOfElementsInFirstArray;i++) {
        	inputInArrayOne[i]=scanner.next();
        }
        for(int i=0;i<numberOfElementsInSecondArray;i++) {
        	inputInArraySecond[i]=scanner.next();
        }
        for(int i=0;i<numberOfElementsInSecondArray;i++) {
        	for(int j=0;i<numberOfElementsInSecondArray;j++) {
        		if(inputInArrayOne[j].equals(inputInArraySecond[i])) {
        			sum++;
        		}
        	}
        	System.out.println(sum);
        }
    }
}

 //--------------------------------------------------------------------------

    	Scanner scanner = new Scanner(System.in);
        int numberOfElementsInFirstArray = scanner.nextInt();
        String string = scanner.nextLine();
        String [] valuesInFirstArray = new String[numberOfElementsInFirstArray];
        for(int i = 0; i < numberOfElementsInFirstArray; i++)
        {
            valuesInFirstArray[i] = scanner.nextLine().trim();
        }
        int numberOfElementsInSecondArray = scanner.nextInt();
        string = scanner.nextLine();
        String [] valuesInSecondArray = new String[numberOfElementsInSecondArray];
        
        for(int i = 0; i < numberOfElementsInSecondArray; i++)
        {
            valuesInSecondArray[i] = scanner.nextLine().trim();
        }
        
        for(int j = 0; j < numberOfElementsInSecondArray; j++)
        {
            int count = 0;
            int strLen = valuesInSecondArray[j].length();
            for(int i = 0; i < numberOfElementsInFirstArray; i++)
            {
                if(strLen == valuesInFirstArray[i].length() && valuesInFirstArray[i].equals(valuesInSecondArray[j]))
                    count++;
            }
            
            System.out.println(count);
        }
    }
}

//------------------------------------------------------------------------------
 
    	*/