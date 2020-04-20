import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DynamicArray{
    
    List<Integer> seq = new ArrayList<Integer>();
    List<List<Integer>> seqlist = new ArrayList<List<Integer>>();
    int lastAnswer = 0;
    public DynamicArray(int N){
    for(int i=0;i< N;i++){
     seq = new ArrayList<Integer>();
     seqlist.add(seq);
    }
    }
    
    void appendValue(int x, int y, int N){
    int rowIndex = ((x ^ lastAnswer)% N );
    List<Integer> seq = seqlist.get(rowIndex);
    seq.add(y);
    }
    
    private void printValue(int x, int y, int N){
    int colIndex = 0;
     int rowIndex = ((x ^ lastAnswer)% N );
    List<Integer> seq = seqlist.get(rowIndex);
    colIndex = y % seq.size();
    lastAnswer = seq.get(colIndex);
    System.out.println(lastAnswer);
    }
    
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int N = scan.nextInt();
int Q = scan.nextInt();
DynamicArray da = new DynamicArray(N);
for(int i=0;i< Q;i++){
    int querType = scan.nextInt();
    int x = scan.nextInt();
    int y = scan.nextInt();
    if(querType == 1){
    da.appendValue(x, y, N);
    }
    else{
    da.printValue(x, y, N);
    }
}
scan.close();
}
}


