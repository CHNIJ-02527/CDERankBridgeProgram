import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<ArrayList<Integer>>();
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        for(int i =1;i<=n;i++)
        {
          ArrayList<Integer> list = new ArrayList<Integer>();
          int ne =in.nextInt();
          for(int j =1;j<=ne;j++)
        { 
            list.add(in.nextInt());
        }
        mainlist.add(list);

    }
    int q =in.nextInt();
    for(int k=0;k<q;k++)
    {
        int x = in.nextInt();
        int y = in.nextInt();
        try
        {
            System.out.println(mainlist.get(x-1).get(y-1));
        }
        catch(Exception e)
        {
            System.out.println("ERROR!");
        }
    }
  }
}
