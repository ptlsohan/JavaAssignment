package com;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Question1 {

	public static void main(String[] args) {
		
Solution s = new Solution();
System.out.println(s.solution(30));
	}

}

class Solution{
	public int solution(int N) {
	//	int rand = new Random().ints(N, Integer.MAX_VALUE).filter(x-> x!=N&&x%10==0).findAny().getAsInt();
		int a=IntStream.range(N, Integer.MAX_VALUE).filter(x-> x!=N&&x%10==0).findAny().getAsInt();
		
		return a;
	}
}
