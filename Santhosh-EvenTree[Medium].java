package com.cts.bridgeprogram.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EvenTree {
	public static Map<Integer , ArrayList<Integer>> tree;
	public static int count;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tnode = sc.nextInt();
		int tedge = sc.nextInt();
		tree = new HashMap<Integer , ArrayList<Integer>>();
		for(int i=1;i<=tnode;i++){
			tree.put(i,new ArrayList<Integer>());
		}
		for(int i=0;i<tedge;i++){
			int child = sc.nextInt();
			int parent = sc.nextInt();
			tree.get(parent).add(child);
		}
		//System.out.println("Tree size====>"+tree.size());
		for(int i=2;i<tree.size();i++){
			if(countChild(i)%2!=0){
			count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
	public static int countChild(int i){
	int totalChild = tree.get(i).size();
		//System.out.println("total child intially =====> "+tree.get(i).size());
		for(int child : tree.get(i)){
		totalChild += countChild(child);
		//System.out.println("tree getting node =====> "+tree.get(i));
		//System.out.println("Count child in for each loop =====> "+countChild(child));
		//System.out.println("total child final ======>"+totalChild);
		}
	return totalChild;
	}
}


