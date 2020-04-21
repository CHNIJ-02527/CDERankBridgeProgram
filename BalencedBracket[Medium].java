package com.cts.bridgeprogram.ds;
import java.util.*;

public class BalencedBracket {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < size; i++) {
			char[] str = scanner.nextLine().toCharArray();
			Stack<Character> stack = new Stack<Character>();
			String result = null;
			String outputResult = "YES";
			for (int j = 0; j < str.length; j++) {
				if (stack.size() > str.length - j) {
					result = "NO_ELEMENT";
					break;
				}
				switch (str[j]) {
				case '{':
				case '[':
				case '(':
					stack.push(str[j]);
					break;

				case '}':
					if (!stack.empty() && stack.peek() == '{') {
						stack.pop();
					} else {
						result = "NO_ELEMENT";
					}
					break;

				case ']':
					if (!stack.empty() && stack.peek() == '[') {
						stack.pop();
					} else {
						result = "NO_ELEMENT";
					}
					break;

				case ')':
					if (!stack.empty() && stack.peek() == '(') {
						stack.pop();
					} else {
						result = "NO_ELEMENT";
					}
					break;
				}
				if (result == "NO_ELEMENT") {
					outputResult = "NO";
					break;
				}
			}
			if (stack.size() > 0) {
				outputResult = "NO";
			}
			System.out.println(outputResult);
			outputResult = "YES";
		}
		scanner.close();
	}
}