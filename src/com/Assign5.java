package com;

import java.util.ArrayList;
import java.util.List;

public class Assign5 {
public static void main(String[] args) {
	List<String> a = new ArrayList<>();
	List<String> b = new ArrayList<>();
	a.add("Mango");
	a.add("Banana");
	a.add("Apple");
	b.add("Man");
	b.add("Apple");
	
	List d = new ArrayList(a);
	d.removeAll(b);
	
	for(String s1: b) {
		for(String s2: a) {
			if(s2.startsWith(s1)) {
				d.remove(s2);
			}
		}
	}
	System.out.println(d);
}
}
