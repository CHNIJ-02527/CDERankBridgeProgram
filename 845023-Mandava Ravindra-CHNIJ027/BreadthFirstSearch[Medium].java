import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution{

    // Complete the bfs function below.
    static int[] bfs(int n, int m, int[][] edges, int s) {
        
        HashSet<Integer> aList[] = new HashSet[n];
        // Array of the nodes of the tree

        Queue<Integer> bfsQueue = new LinkedList();

        boolean visited[] = new boolean[n];
        // check if a node is visited or not


        int cost[] = new int[n];
        // cost to travel from one node to other

        for (int i = 0; i < n; i++) {
            // intialising the values
            visited[i] = false;
            cost[i] = -1;

            aList[i] = new HashSet<Integer>();
            // Each element of aList is a Set
            // To store the neighbouring nodes of a particular node
        }

        for (int i = 0; i < m; i++) {
            // let node[i] <--> node[j]

            // adding node[j] to neighbours list of node[i]
            aList[edges[i][0] - 1].add(edges[i][1] - 1);

            // adding node[i] to neighbours list of node[j]
            aList[edges[i][1] - 1].add(edges[i][0] - 1);
        }

        //
        s = s - 1;
        bfsQueue.add(s);
        visited[s] = true;
        cost[s] = 0;
        //
        
        
        while (!bfsQueue.isEmpty()) {
            
            int curr = bfsQueue.poll();
            // takes the last element of the queue
            
            for (int neigh : aList[curr]) { // iterating the neighbours of node 'curr'
                if (!visited[neigh]) { // checking if node neigh id already visited during the search
                    visited[neigh ] = true;
                    bfsQueue.add(neigh); //add the node neigh to bfsqueue
                    cost[neigh] = cost[curr] + 6; 
                }
            }
        }

        int result[] = new int[n-1];

        for (int i=0, j=0; i<n && j<n-1; i++, j++) {
            if (i == s){
                i++;
            }
            result[j] = cost[i];
        }
        
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] edges = new int[m][2];

            for (int i = 0; i < m; i++) {
                String[] edgesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int edgesItem = Integer.parseInt(edgesRowItems[j]);
                    edges[i][j] = edgesItem;
                }
            }

            int s = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = bfs(n, m, edges, s);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
