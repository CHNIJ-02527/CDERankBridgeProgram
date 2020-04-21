package com.cts.bridgeprogram.ds;
import java.util.*;
public class DyanmicArray {

		List<Integer> seq = new ArrayList<Integer>();
		List<List<Integer>> seqList = new ArrayList<List<Integer>>();
		int lastAns = 0;

		public DyanmicArray(int N) {
			for (int i = 0; i < N; i++) {
				seq = new ArrayList<Integer>();
				seqList.add(seq);
			}
		}

		void appendValue(int X, int Y, int N) {
			int rowIndex = (X ^ lastAns) % N;
			List<Integer> seq = seqList.get(rowIndex);
			seq.add(Y);
		}

		private void printValue(int x, int y, int N) {
			int colIndex = 0;
			int rowIndex = (x ^ lastAns) % N;
			List<Integer> seq = seqList.get(rowIndex);
			colIndex = y % seq.size();
			lastAns = seq.get(colIndex);
			System.out.println(lastAns);
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int N = scanner.nextInt();
			int Q = scanner.nextInt();
			DyanmicArray dynamicArray = new DyanmicArray(N);
			for (int i = 0; i < Q; i++) {
				int queryType = scanner.nextInt();
				int X = scanner.nextInt();
				int Y = scanner.nextInt();
				if (queryType == 1) {
					dynamicArray.appendValue(X, Y, N);
				} else {
					dynamicArray.printValue(X, Y, N);
				}

			}
			scanner.close();
		}

	}