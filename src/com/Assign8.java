package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Assign8 {

	    public static void main(String[] args) {

	        Collection<String> srcstr = new ArrayList<String>();

	        srcstr.add("New York");
	        srcstr.add("Atlanta");
	        srcstr.add("Dallas");
	        srcstr.add("Madison");
	        System.out.println("Number of elements: " + srcstr.size());
	        srcstr.forEach(s->System.out.println(s));
	        Collection<String> deststr = new ArrayList<String>();
	        deststr.add("Delhi");
	        deststr.add("Mumbai");
	        Collections.copy((ArrayList)srcstr,(ArrayList)deststr);
	        deststr.forEach(s->System.out.println(s));
	        
	    }

	
}
