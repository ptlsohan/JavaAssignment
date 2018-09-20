package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assign6 {
public static void main(String[] args) {
	List<String> strings = new ArrayList<String>() ;
	strings.add("A");
	strings.add("B");
	strings.add("C");
	
//	for(String s : strings)
//	{
//	    if (s == "A")
//	    {
//	        strings.remove("A");
//	        break;
//	    }
//	    }
	Iterator<String> itr = strings.iterator(); 
	 while (itr.hasNext()) { 
		 if (itr.next() == "A")
		    {
		        itr.remove();
		       // break;
		    }
	 }
	 
	System.out.println(strings);
}
}
