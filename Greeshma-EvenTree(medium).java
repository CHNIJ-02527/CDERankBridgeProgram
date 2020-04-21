import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Solution {
    public static Map<Integer, ArrayList<Integer>> tree;
    public static int count;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t_nodes = scanner.nextInt();
        int t_edges = scanner.nextInt();
        
        tree = new HashMap<Integer, ArrayList<Integer>>();
        for (int i=1; i<=t_nodes; i++) {
            tree.put(i, new ArrayList<Integer>());
        }
        
        for (int i=0; i<t_edges; i++) {
            int t_from = scanner.nextInt();
            int t_to = scanner.nextInt();
            
            tree.get(t_to).add(t_from);
        }
        
        for (int i=2; i<=tree.size(); i++) {
            if ((countChild(i) % 2) != 0) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    public static int countChild(int node) {
        int totalChild = tree.get(node).size();
        for (int child : tree.get(node)){
            totalChild += countChild(child);
        }
        return totalChild;
    }
}