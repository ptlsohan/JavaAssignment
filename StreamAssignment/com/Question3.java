package com;

import java.util.ArrayList;
import java.util.List;

public class Question3 {

	public static void main(String[] args) {
		String s= "SMS messages are reaLly short";
		Solution3 sol = new Solution3();
		int val=sol.solution(s, 12);
		System.out.println(val);

	}

}

class Solution3{
	public int solution(String s, int k) {
		String str[] = s.split(" ");
		 List<String> lines = new ArrayList<String>();
	        
	        int index = 0;
	        while (index < str.length) {
	        	 if (str[index].length()  > k) break;
	            int count = str[index].length();
	            int last = index + 1;
	            while (last < str.length) {
	                if (str[last].length() + count + 1 > k) break;
	                count += str[last].length() + 1;
	                last++;
	            }
	            
	            StringBuilder builder = new StringBuilder();
	            int diff = last - index - 1;
	            if(diff>=0) {
	            for (int i = index; i < last; i++) {
                    builder.append(str[i] + " ");
                }

	            lines.add(builder.toString());
	            }
	            index = last;
	            
	        }
	        if(lines.isEmpty()) {
	        	return -1;
	        }
	        return lines.size();
	}
}
