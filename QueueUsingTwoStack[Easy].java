package com.cts.bridgeprogram.ds;
import java.util.*;
public class QueueUsingTwoStack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int queueElement = scanner.nextInt();
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		for(int i=0;i<queueElement;i++) {
			int operation=scanner.nextInt();
			if(operation==1) {
				int element=scanner.nextInt();
				stack1.push(element);
			}
			else if(operation==2) {
				if(stack2.isEmpty()) {
					while(!stack1.isEmpty()) {
						stack2.push(stack1.peek());
						stack1.pop();
					}
				}
				stack2.pop();
			}
			else {
				if(stack2.isEmpty()) {
					while(!stack1.isEmpty()) {
						stack2.push(stack1.peek());
						stack1.pop();
					}
				}
				System.out.println(stack2.peek());
			}
		}
		scanner.close();
	}
}
