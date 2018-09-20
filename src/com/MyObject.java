package com;

import java.text.Collator;
import java.util.Locale;

public class MyObject implements Comparable<MyObject>{
    private String name;
    Collator collator = Collator.getInstance(new Locale("pl","PL"));
    public MyObject(String name) {
    	this.name=name;
    }
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
   public int compareTo(MyObject object) {
       return collator.compare(this.name,object.getName());
   }
	@Override
	public String toString() {
		return "MyObject [name=" + name + "]";
	}
	
}
