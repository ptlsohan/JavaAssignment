package com;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li1 = new LinkedList<>(Arrays.asList(13,22,46,50));
		List<Integer> li2 = new LinkedList<>(Arrays.asList(3,14,16,48));
		Solution5 s= new Solution5();
		s.solution(li1,li2);

//		LList li1 = new LList(0);
//		li1.addNode(13);
//		li1.addNode(22);
//
//		li1.addNode(46);
//		li1.addNode(50);
//		
//		LList li2 = new LList(0);
//		li2.addNode(3);
//		li2.addNode(14);
//		li2.addNode(16);
//		li2.addNode(48);
//		
//		li1.print();
//		li2.print();
//		Solution5 s= new Solution5();
//		s.solution(li1,li2);
		
		
	}

}
class Solution5{
	public List<Integer> solution(List<Integer> li1,List<Integer> li2) {
		Stream<Integer> s1 = li1.stream();
		Stream<Integer> s2 = li2.stream();
		List<Integer> sortedList = Stream.concat(s1,s2).sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		return sortedList;

	}
}


