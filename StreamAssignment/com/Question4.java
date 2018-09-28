package com;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Solution4 s = new Solution4();
System.out.println(s.solution(3, 5, 23));
	}
	

}

class Solution4{
	public String solution(int n,int s,int e) {
		
		 String str=IntStream.rangeClosed(s, e).mapToObj(x->String.valueOf(x)).filter(x->x.contains(String.valueOf(n))).collect(Collectors.joining(" ")).toString();
		return str;
		
	}
}