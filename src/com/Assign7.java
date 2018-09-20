package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Assign7 {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("**united**abc");
	list.add("**united**abcd");
	list.add("abcd**united**");
	list.add("**united**abcde");
	list.add("asdasdad**united**");
	list.add("**united**a");
	
	Collections.sort(list, new MyComparator());
	System.out.println(list);
}
}
class MyComparator implements Comparator{
	String query = "**united**";
	@Override
	public int compare(Object o1, Object o2) {
		 if (((String)o1).toLowerCase().startsWith(query)) {
			 if(!((String)o2).toLowerCase().startsWith(query)) {
				 return -1;
			 }
			 if( ((String)o1).length() < ((String)o2).length()) {
			    return  -1;
			  }else if(((String)o1).length() > ((String)o2).length()) {
				  return 1;
			 }
			 return 0;
			  } else if (((String)o2).toLowerCase().startsWith(query) ) {
				  return 1;
			  } else {
			    return 0;
			  }
		
	}
	
}
