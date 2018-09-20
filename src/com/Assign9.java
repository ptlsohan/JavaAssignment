package com;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Assign9 {
public static void main(String[] args) {
	List<MyObject> myList = new ArrayList<MyObject>();
	MyObject obj1 = new MyObject("ę");
	MyObject obj2 = new MyObject("ś");
	MyObject obj3 = new MyObject("ą");
	MyObject obj4 = new MyObject("s");
	myList.add(obj1);
	myList.add(obj2);
	myList.add(obj3);
	myList.add(obj4);
	System.out.println(myList);
	Collections.sort(myList);
	System.out.println(myList);
}
}
