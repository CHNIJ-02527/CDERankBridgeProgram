import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyQueue<Integer> queue = new MyQueue<Integer>();

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int x = sc.nextInt();
                queue.enqueue(x);
            } else if (type == 2) {
                queue.dequeue();
            } else if (type == 3) {
                System.out.println(queue.peek());
            }
        }

        sc.close();
    }
}

class MyQueue<T> {
    Stack<T> Stack1 = new Stack<T>();
    Stack<T> Stack2 = new Stack<T>();

    void enqueue(T item) {
        Stack1.push(item);
    }

    T dequeue() {
        transferIfNeeded();
        return Stack2.pop();
    }

    T peek() {
        transferIfNeeded();
        return Stack2.peek();
    }

    void transferIfNeeded() {
        if (Stack2.empty()) {
            while (!Stack1.empty()) {
                Stack2.push(Stack1.pop());
            }
        }
    }
}
