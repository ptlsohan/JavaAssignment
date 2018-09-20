package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Assign1 {
	public static void main(String[] args) {
		HashMap<Character,ArrayList<Integer>> hm = new HashMap<Character,ArrayList<Integer>>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
		
		System.out.println("Enter key:");
		char key = sc.nextLine().charAt(0);
		System.out.println("Enter value:");
		int value = Integer.parseInt(sc.nextLine());		
		if(hm.containsKey(key)) {
			ArrayList<Integer> temp = hm.get(key);
			temp.add(value);
		}else {
			ArrayList<Integer> temp =new ArrayList<Integer>(value);
			temp.add(value);
			hm.put(key, temp);
		}
		}
		System.out.println(hm);
	}

}
