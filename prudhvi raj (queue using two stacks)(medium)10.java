import java.io.*;
import java.util.*;

public class Solution {
//linked list approach
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> linked = new LinkedList<>();
        int length = in.nextInt();
        while (length-- > 0) {
            int option = in.nextInt();
            if (option == 1) {
                linked.add(in.nextInt());
            }
            else if (option == 2) {
                if (!linked.isEmpty()) {
                    linked.pollFirst();
                }
            }
            else {
                System.out.println(linked.getFirst());
            }
        }
    }
    }
