package com;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Solution2 s= new Solution2();
System.out.println(s.solution("abc"));
	}

}
class Solution2{
	public String solution(String s) {
		char c = s.charAt(0);
		System.out.println(c);
		if(Character.isUpperCase(c))
			return "upper";
		else if(Character.isLowerCase(c))
			return "lower";
		else if(Character.isDigit(c))
			return "digit";
		else
			return "other";
	}
}
