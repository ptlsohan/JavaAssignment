package com;

import java.util.ArrayList;
import java.util.List;

public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("cat mat bat");
		list.add("rat sat bat");
		list.add("wat fat got");
		System.out.println(list);
		int i=0;
		for(String s : list) {
			list.set(i, s.replace(" ", ","));
			i++;
		}
		System.out.println(list);

	}

}
