package com;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Assign4 {
public static void main(String[] args) {
	Assign4 a=new Assign4();
	Map<String,Integer> map = new TreeMap<>();
	a.checkNull(map);
}
public boolean checkNull(Map m) {
	if(m instanceof SortedMap) {
		return false;
	}
	if(m.containsKey(null)) {
		return true;
	}
	return false;
	
}
}

