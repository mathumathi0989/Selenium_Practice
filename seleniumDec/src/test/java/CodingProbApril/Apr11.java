package CodingProbApril;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Apr11 {

	public static void string_1(String s) {
		String s1 = "";
		for(int i=s.length()-1;i>=0; i--) {
			
			s1 = s1 + s.charAt(i);
			
		}
		System.out.println(s1);
		
	}
	
	public static void string_2(String s) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		char[] c = s.toCharArray();
		
		for (char a: c) {
		if(map.containsKey(a)) {
			map.put(a, map.get(a)+1);
		}
		else {
			map.put(a, 1);
		}
	}
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
			 System.out.println(entry.getKey() + ": " +entry.getValue());
			}
		}
	
		
	}
	
	public static void string_3(String s1, String s2) {
		
		char[] a = s1.toCharArray();
		  Arrays.sort(a);
		String s3 = String.valueOf(a);
	
			char[] b = s2.toCharArray();
			  Arrays.sort(b);
				String s4 = String.valueOf(b);

	if(s3.equals(s4)) {
			System.out.println(s1 + " and " + s2 + " are anagram");
		}
		else System.out.println(s1 + " and " + s2 + " are not anagram");
	
		
	}
	
	
	public static  String reverse(String s) {
		if(s==null || s.length()<=1) { 
			return s;
		}
		return reverse(s.substring(1))+ s.charAt(0);
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		string_1("mathu");
		string_2("mathumathi");
		string_3("listen", "silent");
		string_3("mathu", "mathi");
		System.out.println(reverse("mathumathi"));
		
		
/*
How do you reverse a given string in place? 
How do you print duplicate characters from a string? (solution)
How do you check if two strings are anagrams of each other? (solution)
How can a given string be reversed using recursion? (solution)


 */
		
		

	}

}
